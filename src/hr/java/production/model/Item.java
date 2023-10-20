package hr.java.production.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Item {
    private String name;
    private Category category;
    private BigDecimal width;
    private BigDecimal height;
    private BigDecimal length;
    private BigDecimal productionCost;
    private BigDecimal sellingPrice;

    public Item(String name, Category category, BigDecimal width, BigDecimal height, BigDecimal length, BigDecimal productionCost, BigDecimal sellingPrice) {
        this.name = name;
        this.category = category;
        this.width = width;
        this.height = height;
        this.length = length;
        this.productionCost = productionCost;
        this.sellingPrice = sellingPrice;
    }
    public static Item create(Scanner scanner, ArrayList<Category> categories){
        System.out.println("Create an item");
        System.out.println("Enter name");
        String _name = scanner.nextLine();
        Category cat = Item._selectACategory(scanner, categories);
        System.out.println("Enter width");
        BigDecimal w = scanner.nextBigDecimal();
        System.out.println("Enter height");
        BigDecimal h = scanner.nextBigDecimal();
        System.out.println("Enter length");
        BigDecimal l = scanner.nextBigDecimal();
        System.out.println("Enter production cost");
        BigDecimal pCost = scanner.nextBigDecimal();
        System.out.println("Enter selling price");
        BigDecimal sPrice = scanner.nextBigDecimal();
        scanner.nextLine();
        return new Item(_name,cat, w,h,l,pCost,sPrice);
    }
    private static Category _selectACategory(Scanner scanner, ArrayList<Category> categories){
        System.out.println("Select a category");
        for (int i = 0; i < categories.size(); i++) {
            System.out.println(i + " " + categories.get(i).getName());
        }
        int index = scanner.nextInt();
        while(index >= categories.size()){
            System.out.println("Non existing index, try again");
            index = scanner.nextInt();
        }
        return categories.get(index);
    }
    public static ArrayList<Item> _selectItems(Scanner scanner, ArrayList<Item> items){
        System.out.println("Select Items");
        ArrayList<Item> factoryItems = new ArrayList<Item>();
        for (int i = 0; i<items.size(); i++){
            System.out.println(i + " " + items.get(i).getName());
        }
        String indexes;
        System.out.println("Enter integers of items you want to add to this factory(comma spaced), example: (1,2,3)");
        indexes = scanner.nextLine();
        List<String> indexStrings = Arrays.asList(indexes.split(","));
        for (String indexString : indexStrings) {
            try {
                int index = Integer.parseInt(indexString);
                factoryItems.add(items.get(index));
            } catch (NumberFormatException e) {
                // Handle any invalid index strings here, if necessary
                System.err.println("Invalid index: " + indexString);
            }
        }
        return factoryItems;
    }
    public String getName() {
        return name;
    }
    public BigDecimal getVolume(){
        return this.width.multiply(this.height.multiply(this.width));
    }
    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(BigDecimal productionCost) {
        this.productionCost = productionCost;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}

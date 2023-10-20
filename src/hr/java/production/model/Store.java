package hr.java.production.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Store {
    private String name;
    private String webAddress;
    private ArrayList<Item> items;

    public Store(String name, String webAddress, ArrayList<Item> items) {
        this.name = name;
        this.webAddress = webAddress;
        this.items = items;
    }
    public static Store create(Scanner scanner, ArrayList<Item> items){
        System.out.println("Create a store");
        System.out.println("Enter name");
        String _name = scanner.nextLine();
        System.out.println("Enter web address");
        String _web = scanner.nextLine();
        ArrayList<Item> storeItems = Item._selectItems(scanner, items);
        return new Store(_name, _web, storeItems);
    }

    public BigDecimal getCheapestItemPrice(){
        ArrayList<BigDecimal> x = new ArrayList<BigDecimal>();
        for (int i = 0; i<this.items.size(); i++){
            x.add(this.items.get(i).getSellingPrice());
        }
        return Collections.min(x);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}

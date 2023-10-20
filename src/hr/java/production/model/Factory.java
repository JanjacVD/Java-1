package hr.java.production.model;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Factory {
    private String name;
    private Address address;
    private ArrayList<Item> items;

    public Factory(String name, Address address, ArrayList<Item> items) {
        this.name = name;
        this.address = address;
        this.items = items;
    }
    public static Factory create(Scanner scanner, ArrayList<Item> items){
        System.out.println("Create a Factory");
        System.out.println("Enter name");
        String _name = scanner.nextLine();
        ArrayList<Item> facItems = Item._selectItems(scanner, items);
        return new Factory(_name, Address.create(scanner) ,facItems);
    }
    public BigDecimal getLargestItemVolume(){
        BigDecimal x = new BigDecimal(0);
        for (int i = 0; i<this.items.size(); i++){
            if(x.compareTo(this.items.get(i).getVolume()) == -1){
                x = this.items.get(i).getVolume();
            }
        }
        return x;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}

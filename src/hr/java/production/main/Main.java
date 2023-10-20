package hr.java.production.main;

import hr.java.production.model.Category;
import hr.java.production.model.Factory;
import hr.java.production.model.Item;
import hr.java.production.model.Store;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Category> categories = new ArrayList<Category>();
        ArrayList<Item> items = new ArrayList<Item>();
        ArrayList<Factory> factories = new ArrayList<Factory>();
        ArrayList<Store> stores = new ArrayList<Store>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<3;i++) categories.add(Category.create(scanner));
        for (int i = 0; i<5;i++) items.add(Item.create(scanner, categories));
        for (int i = 0; i<2;i++) factories.add(Factory.create(scanner, items));
        for (int i = 0; i<2;i++) stores.add(Store.create(scanner, items));
        BigDecimal x = new BigDecimal(0);
        int index = 0;
        for (int i = 0; i<factories.size(); i++){
            if(x.compareTo(factories.get(i).getLargestItemVolume()) == -1){
                x = factories.get(i).getLargestItemVolume();
                index = i;
            }
        }
        System.out.println("Factory that produces the largest item  by volume is, " + factories.get(index).getName());
        index = 0;
        for (int i = 0; i<stores.size(); i++){
            if(stores.get(index).getCheapestItemPrice().compareTo(stores.get(i).getCheapestItemPrice()) == 1 ) {
                index = i;
            }
        }
        System.out.println("Store that sells the cheapest item is, " + factories.get(index).getName());
    }
}

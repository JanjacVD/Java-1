package hr.java.production.model;

import java.util.Scanner;

public class Category {
    private String name;
    private String description;

    public static Category create(Scanner scanner){
        System.out.println("Create a category");
        System.out.println("Enter name");
        String _name = scanner.nextLine();
        System.out.println("Enter description");
        String _description = scanner.nextLine();
        return new Category(_name,_description);
    }
    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
}

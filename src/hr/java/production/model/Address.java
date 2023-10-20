package hr.java.production.model;

import java.util.Scanner;

public class Address {
    private String street;
    private String houseNumber;
    private String city;
    private String postalCode;

    public Address(String street, String houseNumber, String city, String postalCode) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.postalCode = postalCode;
    }
    public static Address create(Scanner scanner){
        System.out.println("Create an Adresss");
        System.out.println("Enter street name");
        String _name = scanner.nextLine();
        System.out.println("Enter house number");
        String _hn = scanner.nextLine();
        System.out.println("Enter city");
        String _city = scanner.nextLine();
        System.out.println("Enter Postal code");
        String _post = scanner.nextLine();
        return new Address(_name, _hn,_city, _post);
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

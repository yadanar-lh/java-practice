package com.ylh.oop_exe.inheritance;

public class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    double calculateDiscount(){
        price = price - (price * 0.0);
        return price;
    }

    void displayInfo(){
        System.out.println("Product Id : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Discounted Price : $" + price);
    }

}



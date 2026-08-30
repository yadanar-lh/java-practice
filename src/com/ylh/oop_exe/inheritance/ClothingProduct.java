package com.ylh.oop_exe.inheritance;

public class ClothingProduct extends Product{

    String size;
    String material;

    ClothingProduct(int id, String name, double price, String size, String material) {

        super(id, name, price);
        this.size = size;
        this.material = material;

    }

    @Override
    double calculateDiscount(){
        if(material.equalsIgnoreCase("Wool") || material.equalsIgnoreCase("Silk")){
            price = price - (price * 0.1);
            return price;
        }
        return super.calculateDiscount();
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Product Size : " + size);
        System.out.println("Product Material : " + material);
    }
}


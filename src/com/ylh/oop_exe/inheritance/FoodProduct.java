package com.ylh.oop_exe.inheritance;

public class FoodProduct extends Product{

    String expiryDate;
    boolean isOrganic;
    FoodProduct(int id, String name, double price, String expiryDate, boolean isOrganic) {

        super(id, name, price);
        this.expiryDate = expiryDate;
        this.isOrganic = isOrganic;
    }

    @Override
    double calculateDiscount() {
        if(isOrganic){
            price =  price - (price * 0.15);
            return price;
        }
        return super.calculateDiscount();
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Expiry Date : " + expiryDate);
        System.out.println("Is Organic : " + isOrganic);
    }
}


package com.ylh.oop_exe.inheritance;

public class ElectronicProduct extends Product{

    int warrantyMonths;

    ElectronicProduct(int id, String name, double price, int wm) {

        super(id, name, price);
        warrantyMonths = wm;
    }

    @Override
    double calculateDiscount() {
        if(warrantyMonths > 12){
            price = price - (price * 0.05);
            return price;
        }
        return super.calculateDiscount();
    }

    @Override
    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Warranty : " + warrantyMonths);
    }


}

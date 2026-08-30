package com.ylh.oop_exe.inheritance;

public class Test {
    static void main() {
        ShoppingCard shoppingCard = new ShoppingCard();

        Product[] products = {
                new FoodProduct(0001, "Chicken Breast Pack", 15000, "30 Aug 2026", true),
                new ElectronicProduct(0002, "Charger", 10000, 12),
                new ClothingProduct(0003, "Flare Pant", 45000, "Medium", "Silk"),
                new ElectronicProduct(0004, "Air Fryer", 500000, 18),
                new FoodProduct(0005, "Greek Yogurt", 50000, "Sep 20 2026", false)
        };

        for (Product product : products){
            shoppingCard.addProduct(product);
        }

        System.out.println();
        System.out.println("Total Price: " + shoppingCard.calculateTotal());
        System.out.println();
        shoppingCard.displayCart();


    }
}

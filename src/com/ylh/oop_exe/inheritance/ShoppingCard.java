package com.ylh.oop_exe.inheritance;

public class ShoppingCard{
    Product[] products;
    int productCount;
    public final int MAX_SIZE = 10;

    //Pseudocode
    /*
    let productCount be 0
    be max size 10
    In constructor, add new products array list with [productCount]
    then increase productCount

    Adding Product
    --------------
    check condition if max_size is exceeded, cannot be added.
    then assign the product while creating product objects

     */

    ShoppingCard() {
        //without using array list, it increased by 1 whenever the new object is built.
        products = new Product[MAX_SIZE];
        productCount = 0;
    }

     void addProduct(Product p){

        //if shopping card is created more than 10. cannot be added anymore.
        if(productCount >= MAX_SIZE){
            System.out.println("Card is full. Cannot add new products");
            return;
        }
        products[productCount] = p;
        System.out.println(products[productCount].getName() + " is successfully added to the cart.");
        productCount++;

    }

    double calculateTotal(){
        double total = 0;
        for(int i = 0; i < productCount; i++){
            total += products[i].calculateDiscount();
        }
        return total;
    }

    void displayCart(){

        for(int i = 0; i < productCount; i++){
            products[i].displayInfo();
            System.out.println();
        }
    }
}

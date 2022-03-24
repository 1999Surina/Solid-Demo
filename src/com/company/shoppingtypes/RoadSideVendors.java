package com.company.shoppingtypes;

public class RoadSideVendors implements PurchasedListAndBalance{

    @Override
    public void printListOfItemsPurchased() {
       System.out.println("list of items purchased from road-side vendors");
    }

    @Override
    public void checkBalance() {
        System.out.println("balance left after purchasing from road-side vendors");

    }
}

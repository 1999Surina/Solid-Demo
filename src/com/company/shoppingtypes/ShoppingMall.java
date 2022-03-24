package com.company.shoppingtypes;

public class ShoppingMall implements Receipts{

    @Override
    public void printListOfItemsPurchased() {
        System.out.println("list of items from shopping mall");
    }

    @Override
    public void checkBalance() {
        System.out.println("balance left after purchasing");
    }

    @Override
    public void getReceipts() {
        System.out.println("got receipts after purchasing from shopping mall");

    }
}

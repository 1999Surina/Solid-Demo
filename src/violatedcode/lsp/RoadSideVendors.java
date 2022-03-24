package violatedcode.lsp;

public class RoadSideVendors extends ShoppingMall{
    public static void printListOfItemsPurchased(){
        //items from shopping mall
        System.out.print("list of items purchased");


    }
    public static void checkBalance(){

       System.out.print("current balance");
    }
    public static void getReceipts(){//not applicable for street vendors
        System.out.print("Take receipts");

    }
}
//So RoadSideVendors cannot be a substitute of shopping class



package violatedcode.cardpayments;

public class SuperMart {
    private static Debit debit;

    public SuperMart(Debit debit) {
        this.debit = debit;
    }
    public  static void doPurchase(long amount){
        debit.doTransaction(amount);
    }

}

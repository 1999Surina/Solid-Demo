package violatedcode.upipayments;

public class Googlepay implements UPIpayment {
    @Override
    public void getMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
        System.out.println("cashback earned as credit balance in gpay");
    }
}

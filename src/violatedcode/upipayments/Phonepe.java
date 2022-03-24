package violatedcode.upipayments;

public class Phonepe implements UPIpayment{


    @Override
    public void getMoney() {
        System.out.println("Money sent via phonepe");
    }

    @Override
    public void getScratchCard() {
        System.out.println("scratch card earned in phonepe");
    }

    @Override
    public void getCashBackAsCreditBalance() {

    }
}

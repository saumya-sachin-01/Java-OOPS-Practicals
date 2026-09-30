package Practical9part1.PAYMENTSYSTEM;

public class Main {
    static void main() {
        Payment cap = new CardPayment();
        Payment csh = new CashPayment();
        Payment upi = new UPIPayment();
        cap.pay(100);
        csh.pay(200);
        upi.pay(5);
    }
}

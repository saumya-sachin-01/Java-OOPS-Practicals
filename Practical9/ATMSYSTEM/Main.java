package Practical9.ATMSYSTEM;

public class Main {
    static void main() {
        ATM a = new BankATM();
        a.balance=1000;
        System.out.println("Current Balance : "+a.checkBalance());
        a.deposit(5000);
        a.withdraw(2000);
        System.out.println("Current Balance : "+a.checkBalance());
        System.out.println(a.displayMessage("Thankyou"));
    }
}

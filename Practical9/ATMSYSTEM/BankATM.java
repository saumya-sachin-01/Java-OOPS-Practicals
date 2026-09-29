package Practical9.ATMSYSTEM;

public class BankATM extends ATM {
    @Override
    void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance = balance - amt;
            System.out.println(amt + " is debited");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    @Override
    void deposit(double amt) {
        balance = balance + amt;
            System.out.println(amt + " is credited");
    }
    @Override
    double checkBalance(){
        return balance;
    }
}

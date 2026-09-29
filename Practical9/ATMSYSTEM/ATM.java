package Practical9.ATMSYSTEM;

abstract public class ATM {
    double balance;
    abstract void withdraw(double amt);
    abstract void deposit(double amt);
    abstract double checkBalance();
     String displayMessage(String message){
         return message;
     }
}

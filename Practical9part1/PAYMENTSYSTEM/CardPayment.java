package Practical9part1.PAYMENTSYSTEM;

public class CardPayment implements Payment{
@Override
  public  void pay(double amt){
    System.out.println("Paid "+amt+" using Card");
}
}

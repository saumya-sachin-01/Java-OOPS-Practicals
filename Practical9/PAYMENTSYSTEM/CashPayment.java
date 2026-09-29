package Practical9.PAYMENTSYSTEM;

public class CashPayment implements Payment{
   @Override
    public void pay(double amt){
       System.out.println("Paid "+amt+" using Cash");
    }
}

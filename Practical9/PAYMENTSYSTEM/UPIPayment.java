package Practical9.PAYMENTSYSTEM;

public class UPIPayment implements Payment{
    @Override
    public  void pay(double amt){
        System.out.println("Paid "+amt+" using UPI");
    }
}

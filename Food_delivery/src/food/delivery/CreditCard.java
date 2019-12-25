package food.delivery;

import java.util.Scanner;

public class CreditCard extends IPayment {
private String cardNumber;
private String expireDate;
Scanner sc = new Scanner(System.in);
    @Override
    public void pay() {
        System.out.println("Enter your Credit Card number:");
        this.cardNumber = sc.next();
        System.out.println("Enter your Credit Card expire date:");
        this.expireDate = sc.next();
        System.out.println(this.getAmount() + "$ paid successfully");
    }
    
    
    
}

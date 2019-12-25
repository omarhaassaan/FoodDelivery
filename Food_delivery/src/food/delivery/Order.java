package food.delivery;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    private ArrayList<Dish> dishes = new ArrayList();
    private IPayment payment;
    private double totalMoney = 0;
    Scanner sc = new Scanner(System.in);

    Order() {
    }

    public void pay() {
        System.out.println("Enter 1 for creditcard payment");
        System.out.println("Enter 2 for cash payment");
        boolean s = true;
        while (s) {
            s = false;
            switch (sc.nextInt()) {
                case 1:
                    this.payment = new CreditCard();
                    break;
                case 2:
                    this.payment = new Cash();
                    break;
                default:
                    System.out.println("Invalid choice");
                    s = true;
            }
        }
        this.calculateMoney();
        this.payment.setAmount(this.totalMoney);
        this.payment.pay();
    }

    public void calculateMoney() {
        for (int i = 0; i < dishes.size(); i++) {
            this.totalMoney += dishes.get(i).getPrice();
        }
    }
    public ArrayList<Dish> getDishes(){
        return this.dishes;
    }
    public void setDishes(ArrayList<Dish> dishes){
        for (int i = 0; i < dishes.size(); i++) {
            this.dishes.add(dishes.get(i));
        }
    }
}

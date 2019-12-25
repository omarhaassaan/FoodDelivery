package food.delivery;

import java.util.Scanner;

public class Cash extends IPayment {

    private double wallet;
    private double money;
    Scanner sc = new Scanner(System.in);

    @Override
    public void pay() {
        System.out.println("Enter amount of cash payed :");
        this.money = sc.nextDouble();
        if (this.money > this.getAmount()) {
            this.setWallet(this.money - this.getAmount());
            System.out.println(this.wallet + "$ added to your wallet");
        } else if (this.money == this.getAmount()) {

        } else {
            System.out.println("Unsufficient amount");
        }
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getWallet() {
        return wallet;
    }

    public double getMoney() {
        return money;
    }
}

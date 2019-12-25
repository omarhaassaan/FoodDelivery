package food.delivery;

import java.util.Scanner;

public class Dish {

    private String name;
    private double price;
    private int duration;
    private int chefID;
    private boolean finished = false;
    Scanner sc = new Scanner(System.in);

    Dish() {
        System.out.println(" ***************   Dish Information Form *****************");
        System.out.println("Dish Name: ");
        this.name = sc.nextLine();
        System.out.println("Price: ");
        this.price = sc.nextDouble();
        System.out.println("Duration: ");
        this.duration = sc.nextInt();
        this.chefID = Database.getInstance().getCurrentID();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getDuration() {
        return duration;
    }

    public int getChefID() {
        return chefID;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setChefID(int chefID) {
        this.chefID = chefID;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

}

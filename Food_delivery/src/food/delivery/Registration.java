package food.delivery;

import java.util.Scanner;

public class Registration extends Form {

    private User u;
    private String location;
    private int ID;
    private static int numberOfObjects = 0;
    Scanner sc = new Scanner(System.in);

    Registration() {
        form();
    }

    public void registerForm() {
        System.out.println(" ***************   Registration Form *****************");
        System.out.println("Username: ");
        super.setUsername(sc.nextLine());
        System.out.println("Password: ");
        super.setPassword(sc.nextLine());
        System.out.println("Location: ");
        this.location = sc.nextLine();
        System.out.println("Enter 1 for Customer");
        System.out.println("Enter 2 for Chef");
        System.out.println("Enter 3 for Delivery guy");
        numberOfObjects++;
        boolean s = true;
        while (s) {
            s = false;
            switch (sc.nextInt()) {
                case 1:
                    u = new Customer();
                    break;
                case 2:
                    u = new Chef();
                    break;
                case 3:
                    u = new DeliveryGuy();
                    break;
                default:
                    System.out.println("Invalid number entered");
                    s = true;
                    break;

            }
            if (!s) {
                u.setID(numberOfObjects);
                u.setLocation(this.location);
                u.setPassword(super.getPassword());
                u.setUsername(super.getUsername());
            }
        }
        this.commWithDb();
    }

    @Override
    public void getInfo() {
        this.registerForm();
    }

    @Override
    public boolean commWithDb() {
        Database.getInstance().users.add(u);
        return true;
    }

    
    public void setLocation(String location) {
        this.location = location;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static void setNumberOfObjects(int numberOfObjects) {
        Registration.numberOfObjects = numberOfObjects;
    }

    

    public String getLocation() {
        return location;
    }

    public int getID() {
        return ID;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

}

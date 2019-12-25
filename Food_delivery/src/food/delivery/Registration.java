package food.delivery;

import java.util.Scanner;

public class Registration extends Form {

    private User u;
    private String username;
    private String password;
    private String location;
    private int ID;
    private static int numberOfObjects = 0;
    Scanner sc = new Scanner(System.in);

    Registration() {
        form();
    }

    public void RegisterForm() {
        System.out.println(" ***************   Registration Form *****************");
        System.out.println("Username: ");
        super.setUsername(sc.next());
        System.out.println("Password: ");
        super.setPassword(sc.next());
        System.out.println("Location: ");
        this.location = sc.next();
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
                    u.setID(numberOfObjects);
                    u.setLocation(this.location);
                    u.setPassword(this.password);
                    u.setUsername(this.username);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid number entered");
                    s = true;

            }
            if (!s) {
                u.setID(numberOfObjects);
                u.setLocation(this.location);
                u.setPassword(this.password);
                u.setUsername(username);
            }
        }
        this.commWithDb();
    }

    @Override
    public void getInfo() {
        this.RegisterForm();
    }

    @Override
    public boolean commWithDb() {
        Database.getInstance().addUser(u);
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
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

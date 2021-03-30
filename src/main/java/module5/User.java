package module5;

public class User {
    private boolean admin;
    private String name;

    {
        System.out.println("Hello I am fist of block initialization");
    }

    {
        System.out.println("Hello Hello Hello");
    }

     static {
        System.out.println("First...");
         {
            int a = 10;
            int b = 15;
            System.out.println("Second...." + (a + b));
        }
    }



    public User(String name, boolean admin) {
        this.name = name;
        this.admin = admin;

        System.out.println("Name " + name + " admin " + admin);
    }
}

class LauncherUser {
    public static void main(String[] args) {

        new User("John", true);
    }

}
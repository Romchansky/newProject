package module3;

import java.util.Scanner;

public class PassportFormCreator {

    public static void main(String[] args) {
        PassportFormCreator passportFormCreator = new PassportFormCreator();
        passportFormCreator.createForms();
    }

    public void createForms() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your surname");
        String lastName = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt() * 10;
        System.out.println(firstName + " " + lastName + " " + age);
        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toUpperCase());
        System.out.println(age);
        scanner.close();
    }
}

package module3;

import java.util.*;

public class MoonComputerTests {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        scanner.close();
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ((a & b) != 0) {
            int sum = a + b;
            int res = a - b;
            int divide = a * b;
            int multiply = a / b;
            System.out.println(sum + " " + res + " " + divide + " " + multiply);
        }
    }

    public void testLogicalOperators() {
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();

        boolean resultAnd = a && b && c;
        boolean resultOr = a || b || c;

        System.out.println(resultAnd + " " + resultOr);
        scanner.close();
    }




    //Test output on 24, 4 standard input
    public static void main(String[] args) {
        new MoonComputerTests().testMath();
        new MoonComputerTests().testLogicalOperators();
    }
}

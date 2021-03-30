package module2;

public class MarsCalculator {

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sub(int a, int b, int c) {
        return a - (b + c);
    }

    public static int multiply(int a, int b, int c) {
        return sum(a, b, c) * sub(a, b, c);
    }

    public static float divide(int a, int b, int c) {
        return sum(a, b, c) / 10;
    }

    public static void main(String[] args) {

        System.out.println("sum = " + sum(1, 2, 3));
        System.out.println("sub = " + sub(1, 2, 3));
        System.out.println("multiply = " + multiply(1, 2, 3));
        System.out.println(" divide  =" + divide(1, 2, 3));

    }
}
package module5.core.two;

public class Test {

    public static void main(String[] args) {


        System.out.println(factorial(5));
        System.out.println(fibonachi(10));
    }

    static int factorial(int x) {
        if (x == 0) {
            return 1;
        }
        return x * factorial(x - 1);
    }


    static int fibonachi(int n) {

        if (n == 0) {return 0;}
        if (n == 1) {return 1;}
         else { return fibonachi(n - 1) + fibonachi(n - 2); }
    }


}

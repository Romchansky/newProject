package module3;

import java.util.Arrays;

public class QuadraticEquationSolver {

    public double[] solve(int a, int b, int c) {
        double d;
        double x1;
        double x2;
        double x;
        double[] sqrtTwo;
        double[] sqrt0ne;
        double[] sqrtZero;

        d = (b * b) - 4 * a * c;

        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            return sqrtTwo = new double[]{x1, x2};
        } else if (d == 0) {
            x = -b / (2 * a);
            return sqrt0ne = new double[]{x};
        } else {
            return sqrtZero = new double[0];
        }
    }

    public static void main(String[] args) {
    QuadraticEquationSolver quadraticEquationSolver =new QuadraticEquationSolver();

        System.out.println(Arrays.toString(quadraticEquationSolver.solve(1,-2,-3)));
        System.out.println(Arrays.toString(quadraticEquationSolver.solve(1,12,36)));
        System.out.println(Arrays.toString(quadraticEquationSolver.solve(5,3,7)));
    }
}


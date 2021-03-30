package module4.core.one;

class FirNumMultiplyOdd {

    public static void main(String[] args) {
        System.out.println(new FirNumMultiplyOdd().calc(4));
        System.out.println(new FirNumMultiplyOdd().calc(5));

    }

    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                result *= i;
            }
        }
        return result;
    }
}

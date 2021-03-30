package module3;

public class TrurlBank {
    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(7));
        System.out.println(bank.sumQuadsTwo(7));
        System.out.println(bank.sumQuadsThree(7));

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
        System.out.println(bank.countSumOfDigits(1995));
    }

    public int sumQuads(int n) {
        int k = 1;
        int l = 0;
        int sum = 0;

        while (k < (n + n)) {
            l = l + k;
            sum = sum + l;
            k = k + 2;
        }

        return sum;
    }

    public int sumQuadsTwo(int n) {
        int sum = 0;
        int a = 1;
        while (a <= n) {
            int quad = a * a;
            sum = sum + quad;
            a++;
        }
        return sum;
    }


    public int sumQuadsThree(int n) {
        int result = 0;

        while (n > 0) {
            result += n * n;
            n--;
        }

        return result;
    }

    public int countSumOfDigits(int number) {
        int sum = 0;
        int digit;
        while (number != 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }


}

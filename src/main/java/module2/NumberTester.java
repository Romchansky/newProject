package module2;

class NumberTester {
    public boolean isEven(int number) {
        return number % 2 == 0 ;
    }

    //Test output
    public static void main(String[] args) {
        NumberTester tester = new NumberTester();
        System.out.println(tester.isEven(10)); //Should be true
    }
}


package module4.core.one;

class FirNumFizzBuzz {


    public int calc(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (!(i % 15 == 0)) {
                result += i;
            } else if (i % 3 == 0) {
                result += i;
            } else if (i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(new FirNumFizzBuzz().calc(20));
    }
}



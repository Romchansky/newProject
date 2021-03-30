package module2;

public class DigitSplitter {

    public int getFirstDigit(int number){
        return number/10;
    }

    public int getSecondDigit(int number){
        return number % 10;
    }

    public static void main(String[] args) {
        DigitSplitter ds = new DigitSplitter();


        System.out.println(ds.getFirstDigit(15));
        System.out.println(ds.getSecondDigit(15));
    }
}

package module2;

public class MarsEarthHelper {
    public static void main(String[] args) {
        MarsEarthHelper helper = new MarsEarthHelper();

        String str = "hello";


        //Should be 10
        System.out.println("convertAppleCount(10f) = " + helper.convertAppleCount(10f));
    }

    public int convertAppleCount(float count) {
        System.out.println(count);
        return (int) count;
    }


}

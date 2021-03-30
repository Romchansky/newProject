package module3;

public class TriangleDrawer {

    public String drawTriangle(int side) {
        String result = "";
        String asterisk = "*";
        int i = side;
        while (i > 0) {
           result += asterisk.repeat(i);
            i--;
            result += "\n";
            }
        return result;
        }




    public static void main(String[] args) {
        System.out.println(new TriangleDrawer().drawTriangle(10));


//        int rows = 3;
//
//        for (int i = rows; i >= 0; --i) {
//            for (int j = 1; j <= i; ++j) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}








package module3;


import java.util.Arrays;

public class ArlanHelper {
    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));
        System.out.println(helper.drawRect(3, 4, 'X'));
        System.out.println(helper.drawLine(5));
        System.out.println(helper.drawLine(16));
        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 5));

    }

//    public String drawQuad(int n) {
//        int i = 0;
//        while (i < n) {
//            int j =0;
//            while (j < n) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//        return " ";
//    }

    public String drawQuad(int n) {
        String result = "";
        int lines = n;
        while (lines > 0) {
            lines--;
            int columns = n;
            while (columns > 0) {
                result += "*";
                columns--;
            }
            result += "\n";
        }
        return result;
    }

    // width - количество символов
    //height - количество строк
    public String drawRect(int width, int height, char c) {
        String result = "";
        int lines = height;
        while (lines > 0) {
            lines--;
            int columns = width;
            while (columns > 0) {
                result += c;
                columns--;
            }
            result += "\n";
        }
        return result;
    }

    public String drawLine(int length) {
        String result = "";
        String asterisk = "*";
        String hash = "#";
        int lines = length;
        while (lines > 0) {
            result += asterisk;
            lines--;
            if (lines != 0) {
                result += hash;
                lines--;
            }
        }
        return result;
    }

//    public String drawLine(int length) {    // решение GoIT
//        String result = "";
//        boolean star = true;
//        while (length > 0) {
//            result += star ? '*' : '#';
//            star = !star;
//            length--;
//        }
//        return result;
//    }

    public String drawPattern(char[] pattern, int repeatCount){
        String result = Arrays.toString(pattern).replaceAll(", |\\[|\\]" , "");
        String result1= "";
        int repeat = repeatCount;
        while(repeat>0){
            result1+=result;
            repeat--;
        }
        return result1;
    }


}


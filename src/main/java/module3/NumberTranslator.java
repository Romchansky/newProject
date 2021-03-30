package module3;

public class NumberTranslator {

    private static final int FIRST_NUMBER = 1;


    public static int translate(String romanNumber) {

        switch (romanNumber.trim().toLowerCase()) {
            case "i":
                return FIRST_NUMBER;
            case "ii":
                return 2;
            case "iii":
                return 3;
            case "iv":
                return 4;
            case "v":
                return 5;
            case "vi":
                return 6;
            case "vii":
                return 7;
            case "viii":
                return 8;
            case "ix":
                return 9;
            case "x":
                return 10;
            case "xi":
                return 11;
            case "xii":
                return 12;
            default:
                return 0;
        }
    }


    public static void main(String[] args) {
        translate("I");
        translate(" X I");
        translate("iX ");
        translate("XX");
        System.out.println(translate("X"));
        }
    }


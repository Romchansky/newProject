package module6;

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}

class BigOrSmall {

    public String calculate(String text) {

        int upperCase = 0;
        int lowerCase = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) upperCase++;
            if (Character.isLowerCase(text.charAt(i))) lowerCase++;
        }
        if (lowerCase > upperCase) {
            return "Small";
        }
        if (upperCase > lowerCase) {
            return "Big";
        }
        if (lowerCase == upperCase) {
            return "Same";
        }
        return "";
    }
}
package module6;

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));


    }
}

class EmailDetector {

    public boolean isPresent(String text) {
        int MINIMUM_LENGTH = 5;

        if (text.length() < MINIMUM_LENGTH) {
            return false;
        }
        if (!text.contains("@")) {
            return false;
        }
        int i = text.indexOf("@");
        if (i < 2 || i > text.length() - 2) {
            return false;
        }
        if (checkIfNotContainsSpace(text, i)) {
            return true;
        }
        return false;
    }

    private static boolean checkIfNotContainsSpace(String text, int i) {
        if (text.charAt(i - 1) != ' ' && text.charAt(i - 2) != ' ' &&
                text.charAt(i + 1) != ' ' && text.charAt(i + 2) != ' ') {
            return true;
        }
        return false;
    }
}


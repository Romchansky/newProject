package module6;

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}

class DigitText {
    public boolean detect(String text) {
        try {
            text = text.replace(" ", "");
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
/*class DigitText {
    public boolean detect(String text) {
        String textToFind = text.replace(" ", "");
        if (textToFind.matches("[0-9]+")) {
            return true;
        }
        return false;
    }
}*/
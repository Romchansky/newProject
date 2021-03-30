package module6;

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));

        //true
        System.out.println(new MathDetector().isMath("1-1=o"));


    }
}

class MathDetector {

    public boolean isMath(String text) {

        boolean result = false;

        int symbol = text.length() - text.replaceAll("\\=+", "").length();
        int mathematicsSymbols = text.length() - text.replaceAll("[\\+ \\- \\* \\/]+", "").length();
        int digits = text.length() - text.replaceAll("\\d+", "").length();

        if (symbol >= 1 && mathematicsSymbols >= 1 && digits >= 2) {
            result = true;
        }
        return result;
    }
}


//    в тексте есть хотя бы один символ =;
//        в тексте есть хотя бы один математический оператор +, -, *, /;
//        в тексте есть минимум 2 цифры.
package module6;

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));



    }
}

class PunctuationMarkCounter {

    public int count(String phrase) {
        char[] chars = {'.', ',', '!', ':', ';'};
        char[] myString = phrase.toCharArray();

        int counter = 0;
        for (int i = 0; i < myString.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (myString[i] == chars[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }


}


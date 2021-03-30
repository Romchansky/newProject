package module6;

import java.util.Locale;

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
        System.out.println(counter.count("SATOR AREPO TENET"));

    }
}

class PalindromeCounter {

    public int count(String phrase) {
        int count = 0;
        String[] myPhrase = phrase.toLowerCase(Locale.ROOT).split(" ");
        for (String words : myPhrase) {
            StringBuilder stringBuilder = new StringBuilder(words);
            stringBuilder.reverse();
            if (words.equals(stringBuilder.toString())) {
                count++;
            }
        }
        return count;
    }
}


//    private String reverse(String word) {
//        String result = "";
//        char[] chars = word.toCharArray();
//        for(char c: chars) {
//            result = c + result;
//        }
//        return result;
//    }
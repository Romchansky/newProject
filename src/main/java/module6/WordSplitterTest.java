package module6;

import java.util.Arrays;
import java.util.Locale;

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");
        String[] words1 = wordSplitter.split("This is Sparta");



        //[hello, world]
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(words1));


    }
}

class WordSplitter {

    public String[] split(String phrase) {
//        String[] splitString;
//        phrase = phrase.replaceAll(" +"," ");
//        splitString = phrase.toLowerCase().split(" ");
//        return splitString;

        return phrase.replaceAll(" +"," ").toLowerCase().split(" ");

    }
}

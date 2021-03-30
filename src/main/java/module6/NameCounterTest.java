package module6;

import java.util.ArrayList;
import java.util.List;

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}

class NameCounter {

    public int count(String text) {

        int countName = 0;
        String[] myText = text.split(" ");
        for (int i = 0; i < myText.length; i++) {
            if (Character.isUpperCase(myText[i].charAt(0)) && myText[i].length() >= 2) {
                if (Character.isLowerCase(myText[i].charAt(1))) {
                    countName++;
                }
            }
        }
        return countName;
    }
}


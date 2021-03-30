package module6;


class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));

        //true
        System.out.println(new WordCombine().canCombine("Roman", "rom"));

        //false
        System.out.println(new WordCombine().canCombine("WTTIJJ", "DE"));


    }
}

class WordCombine {

    public boolean canCombine(String sourceWord, String targetWord) {

        for (int i = 0; i < sourceWord.length(); i++) {
            for (int j = 0; j < targetWord.length(); j++) {

                if (sourceWord.toLowerCase().charAt(i) == targetWord.toLowerCase().charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
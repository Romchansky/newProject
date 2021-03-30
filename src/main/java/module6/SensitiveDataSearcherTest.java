package module6;

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}

class SensitiveDataSearcher {

    public boolean isSensitiveDataPresent(String phrase) {
        boolean sensitive = false;
        String[] sensitiveWords = {"pass", "key", "login", "email"};
        String[] myPhrase = phrase.replace(":", " ").split(" ");
        for (String words : myPhrase) {
            for (String myWord : sensitiveWords) {
                if (myWord.equalsIgnoreCase(words)) {
                    sensitive = true;
                }
            }
        }
        return sensitive;
    }
}

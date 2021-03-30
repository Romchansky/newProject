package module6;


class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();
        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));
        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}
class WordDeleter {

        public String remove(String phrase, String[] words) {
            boolean found = false;
            String[] phrases = phrase.split(" ");
            StringBuilder result= new StringBuilder();
            for(String phr : phrases) {
                for (String word : words) {
                    if (phr.equals(word)) {
                        found = true;
                        continue;
                    }
                }
                if (!found) {
                    result.append(phr);
                    result.append(" ");
                }
                found = false;
            }
            return result.toString().trim();
        }
    }
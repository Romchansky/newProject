package module6;

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}

class UniqueCharCounter {

    public int count(String phrase) {
    char[] letter = phrase.toCharArray();
    int count = phrase.length();
        for (int i = 0; i < letter.length ; i++) {
            if(i != phrase.indexOf(letter[i])) {
                count--;
            }
        }
        return count;
    }
}

package module6;


class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}

class WordFreqCounter {

    public float countFreq(String phrase, String word) {
        float count = 0f;
        phrase = phrase.toLowerCase();
        word = word.toLowerCase();
        String[] phrase2 = phrase.split(" ");
        for (String s : phrase2) {
            if (word.equals(s)) {
                count++;
            }
        }
        count /= phrase2.length;
        return count;
    }
}



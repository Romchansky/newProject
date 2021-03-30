package module6;

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}

class AvgWordLength {

    public double count(String phrase) {
        int count = 0;
        double sum = 0;
        String[] wordsPhrase = phrase.split(" ");
        for (String word : wordsPhrase) {
            sum += word.length();
            count++;
        }
        if (count > 0) {
            sum /= count;
        }
        return sum;
    }
}




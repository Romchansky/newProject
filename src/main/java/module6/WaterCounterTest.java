package module6;

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}

class WaterCounter {

    public double count(String text) {

        double spaceCount = text.length() - text.replaceAll(" +", "").length();
        double lettersCount = text.length() - text.replaceAll("\\D+", "").length();

        double resultWater = spaceCount / lettersCount;

        return resultWater;
    }
}

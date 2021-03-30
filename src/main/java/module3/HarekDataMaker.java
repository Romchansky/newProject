package module3;

import java.util.Arrays;

public class HarekDataMaker {


    public static void main(String[] args) {
        HarekDataMaker harekDataMaker = new HarekDataMaker();

        String[] names = new String[]{"hter", "pou", "diz"};
        int[] ages = new int[]{30, 35, 70};
        String[] planets = new String[]{"Mars", "Earth", "Jupiter"};


        System.out.println(Arrays.toString(harekDataMaker.aggregateAll(names, ages, planets)));
    }

    public String aggregateSingle(String name, String age, String planet) {
        return "name - " + name + ", age - " + age + ", planet - " + planet;
    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        String[] aggregate = new String[3];
        aggregate[0] = aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]);
        aggregate[1] = aggregateSingle(names[1], Integer.toString(ages[1]), planets[1]);
        aggregate[2] = aggregateSingle(names[2], Integer.toString(ages[2]), planets[2]);
        return aggregate;
    }
}

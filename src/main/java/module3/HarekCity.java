package module3;

import java.util.*;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[9] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }

    public String[] changeElectResultAgain(String[] results) {
        return Arrays.copyOfRange(results, results.length - 3, results.length);
    }

    public char[][] createKeyboard() {
        char[][] keyboard =
                new char[][]{
                        {'1', '2', '3'},
                        {'4', '5', '6'},
                        {'7', '8', '9'},
                        {'*', '0', '#'}
                };
        return keyboard;
    }

    public void printKeyboard() {
        char[][] evenNumbers = createKeyboard();
        System.out.println(Arrays.toString(evenNumbers[0]));
        System.out.println(Arrays.toString(evenNumbers[1]));
        System.out.println(Arrays.toString(evenNumbers[2]));
        System.out.println(Arrays.toString(evenNumbers[3]));
        }
        public String[] makeCopy (String[]names) {
            String[]copyArray = Arrays.copyOf(names, names.length);
            System.out.println("Copied!");
            return copyArray;
        }


    public static void main(String[] args) {
        String[] results = new String[]{"mix", "max", "pex", "fux", "rox"};
        String[] changedResults = new HarekCity().changeElectResultAgain(results);
        System.out.println(Arrays.toString(changedResults));

        char[][] keyboard = new HarekCity().createKeyboard();
        for (int i = 0; i < keyboard.length; i++) {
            System.out.println(Arrays.toString(keyboard[i]));
        }

        new HarekCity().printKeyboard();

        String[] source = new String[] {"Hero", "Mihu"};
        String[] copy = new HarekCity().makeCopy(source);

        source[0] = "CHANGED!"; //Мы меняем исходный массив, но на копии это не отображается

        System.out.println(Arrays.toString(copy));
    }
}
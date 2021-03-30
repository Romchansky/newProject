package module3;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {

    static Object ArrayUtils;

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 8, 10, 15};
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++)
//            array[i] = (-1) * array[i];
//        Arrays.sort(array);
//        for (int i = 0; i < array.length; i++)
//            array[i] = (-1) * array[i];
//
//        System.out.println(Arrays.toString(array));
//
//        System.out.println();
        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.toString(array));
    }
}

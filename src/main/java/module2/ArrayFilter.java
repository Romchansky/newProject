package module2;

import java.util.Arrays;

public class ArrayFilter {
    public static void main(String[] args) {
        // результат  2 4 6 0 0 0 0
        int[] input = new int[]{1, 2, 3, 5, 4, 6, 7};

        System.out.println(Arrays.toString(filter(input)));
    }

    public static int[] filter(int[] input) {
        //создать новый массив такой же длины
        // пройти по массиву
        // проверить все элементы массива четные или нет
        //сохранить четные элементы в новый массив
        //вернуть массив

        int[] filterEvenNumbers = new int[input.length];
        int b = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                filterEvenNumbers[b] = input[i];
                b++;
            }
        }
        return filterEvenNumbers;
    }
}

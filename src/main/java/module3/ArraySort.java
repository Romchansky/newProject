package module3;

import java.util.Arrays;

public class ArraySort {
  static int[] array = new int[] {1, 5, 8, 2, 3, 4, 10, 13, 17, 22};

    public static void main(String[] args) {

      int [] sortedArray =bubleSort(array);
        System.out.println(Arrays.toString(sortedArray));

    }

    public static int[] bubleSort(int[]array){
       int[] copyArray = Arrays.copyOf(array,array.length);
        int n = copyArray.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (copyArray[j] > copyArray[j+1]) {
                    copyArray[j] = copyArray[j] + copyArray[j+1];
                    copyArray[j+1] = copyArray[j] - copyArray[j+1];
                    copyArray[j] = copyArray[j] - copyArray[j+1];
                }
        return copyArray;
    }

//             int x = 10;
//             int y = 23;
//
//             x = x + y;
//             y = x - y;
//             x = x - y;
//
//          System.out.println("x = " + x);
//         System.out.println("y = " + y);
//             output will be:
//
//             x = 23
//             y = 10

}

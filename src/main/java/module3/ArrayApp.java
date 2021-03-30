package module3;

public class ArrayApp {
    public static void main(String[] args) {
        long[] arr;          //ссылка на массив
        arr = new long[100]; //создание массива
        int nElems = 0;      //количество элементов
        int j;               //счетчик цикла
        long searchKey;      //ключи искомого элемента

        // вставка 10 элементов
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10; //массив содержит 10 элементов

        // вывод элементов
        for (j = 0; j < nElems; j++)
            System.out.print(arr[j] + " ");
        System.out.println("");

        searchKey = 55;                      //удаление элемента с ключом  55
        for (j = 0; j < nElems; j++) { //поиск удаляемого элемента
            if (arr[j] == searchKey)
                break;
        }
        for (int k = j; k < nElems - 1; k++) //сдвиг последующих элементов
            arr[k] = arr[k + 1];
        nElems--;                            //уменьшение размера

        for (j = 0; j < nElems; j++)         //вывод элементов
            System.out.print(arr[j] + " ");
        System.out.println("");

    }
}

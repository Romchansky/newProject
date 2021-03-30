package module6;

import java.util.Arrays;

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}


class DigitExtracter {

    public int[] extract(String text) {
            String replaceInteger = text.replaceAll("\\D", "");
            char[] integersToChar = replaceInteger.toCharArray();
            int[] numbers = new int[integersToChar.length];

            for (int i = 0; i < integersToChar.length; i++) {
                numbers[i] = Character.getNumericValue(integersToChar[i]);
            }
            return numbers;
        }
    }





   // Напиши класс DigitExtracter. В этом классе создай метод public int[] extract(String text).
   // Метод принимает строку, и возвращает массив всех цифр, которые есть в этой строке, в том же порядке,
  // в котором они встречаются.

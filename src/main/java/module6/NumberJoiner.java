package module6;

class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder builder = new  StringBuilder();

        for (int i = 0; i < numbers.length ; i++) {
           builder.append(numbers[i]);
        }
        return builder.toString();
    }
}

class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }
}

package module10.streamExercises;

import java.util.List;

import static java.util.Arrays.asList;

public class Task5 {

    public static void main(String[] args) {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);

        Integer result = numbers.stream()
                .reduce(0, Integer::sum);


        System.out.println(result);
    }
}

package module10.streamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Task2 {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("My", "name", "is", "Roman", "Petrenko");
        List<String> expected = Arrays.asList("My", "is");

        final List<String> result = input.stream()
                .filter(word -> word.length() < 4)
                .collect(Collectors.toList());

        System.out.println(result);
        System.out.println("IS result correct " + expected.equals(result));
    }
}

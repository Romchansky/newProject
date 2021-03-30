package module10.streamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        final List<String> input = Arrays.asList("My", "name", "is", "Roman", "Petrenko");
        final List<String> expected = Arrays.asList("MY", "NAME", "IS", "ROMAN", "PETRENKO");

        final List<String> result = input.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
        System.out.println("Is list equals? " + expected.equals(result));

    }
}

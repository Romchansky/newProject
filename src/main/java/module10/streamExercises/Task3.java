package module10.streamExercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Task3 {
    public static void main(String[] args) {

       List<List<String>> input = asList(asList("Victor","John"), asList("Roman","Petrenko","Third!"));
       List<String> excepted = asList("Victor","John","Roman","Petrenko","Third!");

       List<String> result = new ArrayList<>();
       for (List<String> innerList : input) {
           result.addAll(innerList);
       }
        System.out.println("Result w/o stream api " + result);

       List<String> resultStreamAPI = input.stream()
               .flatMap(Collection::stream)
               .collect(Collectors.toList());

        System.out.println("Result with stream api " + resultStreamAPI);
    }
}

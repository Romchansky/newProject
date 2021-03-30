package module10.streamExercises;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Task9 {
    public static void main(String[] args) {


        Employee sara = new Employee("Sara", 43);
        Employee victor = new Employee("Victor", 40);
        Employee eva = new Employee("Eva", 42);

        List<Employee> collection = asList(sara, victor, eva);

        final String resultNames = collection.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.joining(" ,","Names: ", "."));

        System.out.println(resultNames);

    }
}

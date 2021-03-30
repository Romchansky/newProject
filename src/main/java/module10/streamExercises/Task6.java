package module10.streamExercises;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Task6 {
    public static void main(String[] args) {

        Employee sara = new Employee("Sara", 19);
        Employee victor = new Employee("Victor", 40);
        Employee eva = new Employee("Eva", 42);
        Employee anna = new Employee("Anna", 20);

        List<Employee> input = asList(sara, victor, eva, anna);

        final List<String> result = input.stream()
                .filter(employee -> employee.getAge() < 25)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(result);

    }
}

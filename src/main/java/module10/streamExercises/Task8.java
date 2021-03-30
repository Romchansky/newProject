package module10.streamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task8 {

  static Employee SARA = new Employee("Sara", 44, "Norwegian");
  static Employee VICTOR = new Employee("Victor", 40, "Serbian");
  static Employee EVA = new Employee("Eva", 42, "Norwegian");


    public static void main(String[] args) {


        List<Employee> employees = Arrays.asList(SARA,VICTOR,EVA);

        final Map<String, List<Employee>> nationality = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getNationality()));

        System.out.println(nationality);


    }
}

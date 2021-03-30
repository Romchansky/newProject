package module10.streamExercises;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

public class Task4 {
    public static void main(String[] args) {
        Employee sara = new Employee("Sara", 45);
        Employee victor = new Employee("Victor", 40);
        Employee eva = new Employee("Eva", 42);

        List<Employee> collection = asList(sara, victor, eva);


        Employee maxEmployee = collection.stream()
                .max(Comparator.comparing(Employee::getAge)).get();


        System.out.println(maxEmployee.getName() + " is the oldest person" );


    }
}

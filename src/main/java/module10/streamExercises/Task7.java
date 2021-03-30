package module10.streamExercises;

import java.util.IntSummaryStatistics;
import java.util.List;

import static java.util.Arrays.asList;

public class Task7 {
    public static void main(String[] args) {
        Employee sara = new Employee("Sara", 44);
        Employee victor = new Employee("Victor", 40);
        Employee eva = new Employee("Eva", 42);

        List<Employee> input = asList(sara, victor, eva);


        final IntSummaryStatistics summary = input.stream()
                .mapToInt(employee -> employee.getAge())
                .summaryStatistics();

        final double averageAge = summary.getAverage();
        final long sum = summary.getSum();
        final int max = summary.getMax();
        final int min = summary.getMin();
        final long countPeople = summary.getCount();

        System.out.println(averageAge);
        System.out.println(countPeople);
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}

package module10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    private static List<Employee> eployees = new ArrayList<>(Arrays.asList(
            new Employee(2, "Bohdan", UserStatus.ACTIVE),
            new Employee(3, "Andrew", UserStatus.ACTIVE),
            new Employee(4, "Taras", UserStatus.NOT_ACTIVE),
            new Employee(13, "Victor", UserStatus.NOT_ACTIVE),
            new Employee(11, "Anna", UserStatus.ACTIVE),
            new Employee(12, "Olya", UserStatus.NOT_ACTIVE),
            new Employee(10, "Oleh", UserStatus.ACTIVE),
            new Employee(457, "Taras", UserStatus.NOT_ACTIVE),
            new Employee(8, "Andrew", UserStatus.NOT_ACTIVE)
    ));

    public static void main(String[] args) {

        //filter by active status
        List<Employee> activeEmployees = new ArrayList<>();
        for (Employee employee : eployees) {
            if (employee.getStatus().name().equals(UserStatus.ACTIVE.name())) {
                activeEmployees.add(employee);
            }
        }

        //sort
        activeEmployees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        });

        //map names
        List<String> employeeNames = new ArrayList<>();
        for (Employee employee : activeEmployees) {
            employeeNames.add(employee.getName());
        }

        //with stream
        List<String> employeeWithStream = eployees.stream()
                .filter(employee -> employee.getStatus().name().equals(UserStatus.ACTIVE.name()))
                .sorted(Comparator.comparingInt(Employee::getId))
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(employeeNames);
        System.out.println(employeeWithStream);
    }
}

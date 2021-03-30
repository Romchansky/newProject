package module10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReference {
    private static List<Employee> eployees = new ArrayList<>();


    {
        eployees.add(new Employee(2, "Bohdan", UserStatus.ACTIVE));
        eployees.add(new Employee(3, "Andrew", UserStatus.ACTIVE));
        eployees.add(new Employee(4, "Taras", UserStatus.NOT_ACTIVE));
        eployees.add(new Employee(5, "Andrew", UserStatus.NOT_ACTIVE));
    }

    public static void main(String[] args) {

        //static methods
        Consumer<Employee> printEmployee = employee -> EmployeeUtils.printEmployee(employee);
        //with method reference
        Consumer<Employee> printEmployeeWithReference = EmployeeUtils::printEmployee;
        printEmployeeWithReference.accept(new Employee(1, "Roman", UserStatus.ACTIVE));

        //non static with class instance
        EmployeeUtils employeeUtils = new EmployeeUtils();
        Consumer<String> printName = name -> employeeUtils.printName(name);
        //with method reference
        Consumer<String> printNameWithReference = employeeUtils::printName;
        printNameWithReference.accept("Tarsa");

        //non static method without class instance
        BiConsumer<EmployeeUtils, String> printName1 = (employeeUtil, name) -> employeeUtil.printName(name);
        //with method reference
        BiConsumer<EmployeeUtils, String> printName1WithReference1 = EmployeeUtils::printName;
        printName1WithReference1.accept(new EmployeeUtils(), "Tars");


        //constructor, create instance
        final Supplier<Employee> getEmployees = () -> new Employee();
        //with reference
        Supplier<Employee> getEmployeeWithReference = Employee::new;

    }

}

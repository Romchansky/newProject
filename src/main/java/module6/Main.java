package module6;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("first","last",new String[]{"history","algebra"});

        System.out.println(student.toString());
        Student student2 = student.setFirstName("secondName").setLastName("thirdLastName");
        System.out.println(student2.toString());
        Student student3 = student.setLastName("secondLastName");
        System.out.println(student3.toString());


    }
}

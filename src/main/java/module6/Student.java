package module6;

import java.util.Arrays;
import java.util.Objects;

public final class Student {

    private final String firstName;
    private final String lastName;
    private final String[] lessons;

    public Student(String firstName, String lastName, String[] lessons) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lessons = lessons;
    }

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        return new Student(firstName, lastName, lessons);
    }

    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        return new Student(firstName, lastName, lessons);
    }

    public String[] getLessons() {
        return Arrays.copyOf(lessons, lessons.length);
    }

    public Student setLessons(String[] lessons) {
        return new Student(firstName, lastName, lessons);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Arrays.equals(lessons, student.lessons);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName);
        result = 31 * result + Arrays.hashCode(lessons);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lessons=" + Arrays.toString(lessons) +
                '}';
    }
}

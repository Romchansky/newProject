public class People  {  //implements Comparable<People>

    private String name;
    private String surname;
    private Integer age;

    public People(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
//
//    @Override
//    public int compareTo(People people) {
//        boolean equals = age.equals(people.getAge());
//        return Integer.compare(age, people.getAge());
//    }
}

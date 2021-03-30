package module5;

public class Person {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name){
        this.name = name;
       System.out.println("Name is " + name);
   }

   public Person(String firstName, String lastName){
       System.out.println("First name is " + firstName + ", last name is " + lastName);
   }

    public static void main(String[] args) {
        new Person("John");
        Person person = new Person("Brand");
        String brand = "Brand";
        System.out.println(person);
        person.setName("Smith");
        System.out.println(person.getName());
        System.out.println(person);


        new Person("Doe");
        new Person("John", "Doe");

    }
}

package module5;

class Human {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String printName() {
        System.out.println(getName());
        return getName();
    }


}

class HumanTest {
    public static void main(String[] args) {

        Human human = new Human() {
            public String printName() {
                System.out.println("Name is " + getName());
                return getName();
            }
        };

        human.setName("Elon");

        human.printName(); //Name is Elon
    }
}

package module5;

class SpaceObject {
    public SpaceObject() {
        System.out.println("Space Object Constructor");
    }
}

class Star extends SpaceObject {
    public Star() {
        System.out.println("Star Constructor");
    }
}

class Launcher {
    public static void main(String[] args) {
        new Star();
    }
}

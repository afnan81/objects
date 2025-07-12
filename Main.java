abstract class Objects {
    abstract void showShape();

    public void shape() {
        System.out.println("I'm from abstract class");
    }
}

class Sphere extends Objects {
    @Override
    public void showShape() {
        System.out.println("Object type is Sphere");
    }
}

class Cuboid extends Objects {
    @Override
    public void showShape() {
        System.out.println("Object type is Cuboid");
    }
}

public class Main {
    public static void main(String[] args) {
        Objects obj = new Sphere();
        obj.showShape();

        obj = new Cuboid();
        obj.showShape();
    }
}

package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        shape.area();
        circle.area();
        Square s = new Square();
//        s.greeting(); // prefer referencing using class name not object as static does not depend
        // on object .
        s.greeting(); // we can inherrit static meathods
        Shapes abc = new Square();
        abc.greeting();
        // in upper abc.greeting ,e output is from shapes class not from object square class
        // as ting is static and static depends on class not objects
    }
}

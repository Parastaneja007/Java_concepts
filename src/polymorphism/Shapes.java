package polymorphism;

public class Shapes {
    void area(){
        // if we put final void area() then we can not override this.
        System.out.println("i am in shapes");

    }
    static void greeting(){
        System.out.println("inside the shapes class");
    }
}

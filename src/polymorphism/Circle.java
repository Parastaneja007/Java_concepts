package polymorphism;

public class Circle extends Shapes{
    @Override // this is called annotation , it tells that is the function is overridden or not
    // it will show error if we write something like area2 . it will show error 
    void area(){
        System.out.println("Area is pie * r * r");
        // it will run when object of circle is created
        // hence it is overriding the parent class
    }
}

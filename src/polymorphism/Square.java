package polymorphism;

public class Square  extends Shapes{
    void area(){
        System.out.println("Area is side * side ");
    }
//    @Override // static meathods are not overridden as static does not depend on objects
    //but override depends on objects .
        static void greeting(){
        System.out.println("inside square");
    }
}

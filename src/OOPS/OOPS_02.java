package OOPS;

public class OOPS_02 {
    public static void main(String[] args) {
    A obj = new A();
    System.out.println(obj);//hash value will be generated
        //because internally it call tostring() meathod so it is like obj.tostring()
        // and if tostring() is not present in class so it has by deafault hash code generation
        //but if we want to change or want something like to print name or something . we use override
        //function which we will study in oop_03
    }
}
class A {
    int roll_no;
    String name ;

}

package polymorphism;

public class Compile_time {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5 , 6));
        System.out.println(c.add(1.5 , 7));
     System.out.println(c.add(12, 35 , 78));
    }
}
class Calculator{
    int add( int a , int b){
        return a + b;
    }
    double add (double a , double b){
        return a +b;
    }
    int add(int a , int b , int c){
        return a + b + c;
    }
}

package Exception_handling;

public class Throw_throws {
    public static void main(String[] args) {
        int a = 5 ;
        int b = 0 ;
        try {
            divide(a, b);
        } catch(java.lang.Exception e ){
            System.out.println(" exception caught");
        }

    }
    static int divide(int a , int b) throws ArithmeticException{
        if (b == 0 ){
            throw new ArithmeticException("can not be divided by zero");
        }
        return a / b ;
    }
}

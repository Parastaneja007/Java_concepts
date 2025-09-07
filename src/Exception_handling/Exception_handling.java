package Exception_handling;

public class Exception_handling {
    public static void main(String[] args) {


        int[] numerators = {10, 20, 30, 40};
        int[] denominators = {1, 2, 0, 4};
        for (int i = 0; i < numerators.length; i++) {
            System.out.println(divide(numerators[i], denominators[i]));
        }
    }

    public static int divide(int a, int b) {
        try {
            return a / b ;
        } catch (ArithmeticException e){
//            ArithmeticException is a class in Java (it extends RuntimeException).

//            When division by zero happens, the JVM automatically creates an object of ArithmeticException.
//
//                    That object is then assigned to the reference variable e.
//
//                    So, e is a reference variable pointing to an ArithmeticException object (just like Dog d points to a Dog object).
            System.out.println(e);
            return -1 ;
        }
    }
}

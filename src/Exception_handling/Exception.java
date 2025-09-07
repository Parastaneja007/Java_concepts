package Exception_handling;

public class Exception extends Throwable {
    public static void main(String[] args) {
        int[] numerators = {10, 20, 30, 40};
        int[] denominators = {1, 2, 0, 4};
        for (int i = 0; i <= numerators.length ; i++){
            System.out.println(divide(numerators[i] , denominators[i]));
        }
    }
    public static int divide(int a , int b){
        return a / b ;
        // after running the program first 2 outputs will be fine but exception will occour
        // in 30/0 as we cannot divide number by 0 and it will occour at the runtime
        // and due to this the whole code  further not run and to solve this we need
        // exception handling so the further code runs properly
    }
}

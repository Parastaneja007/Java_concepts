package Exception_handling;
public class Multiple_catch {
    public static void main(String[] args) {
        try {
            int[] arr = {10 , 20};
            System.out.println(arr[5]);
        } catch(ArithmeticException e){
            System.out.println(" Arithmatic exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound");
        }
        catch( java.lang.Exception e){
            System.out.println("other exception");
        } finally{
            System.out.println("this will always execute");
        }
    }
}


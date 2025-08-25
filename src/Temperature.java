import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        float number = input.nextFloat();
        int result =(int)(number + 1);
        System.out.println(result);
//        System.out.println("Enter the temperature in Celsius");
//        float TempC = input.nextFloat();
//        System.out.println("The temp. in Celsius in "+ TempC);
//        float TempF = (TempC * 9/5) + 32 ;
//        System.out.println("The temperature in Fahrenheit " + TempF);
    }
}

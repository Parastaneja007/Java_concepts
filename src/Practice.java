import java.util.Scanner;

public class Practice {
    //taking inputs
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a number");
//        int b = input.nextInt();
//        System.out.println(b);
//
//    }
    //sum of two number
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter number 1");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int sum = a + b ;
//        System.out.println("sum of two numbers is " + sum);
//    }
    //type conversion
//    public static void main(String[] args) {
//        int a = 10;
//        double b =a;
//        System.out.println(b);
//
//    }
    //type casting
//    public static void main(String[] args) {
//        double a = 10.4;
//        int b = (int)(a);
//        System.out.println(b);
//    }
    // type promotion
//    public static void main(String[] args) {
//        byte a = 50;
//        byte b = 40;
//        int c = a*b;
//        System.out.println(c);
//    }
    //temperature conversion
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter temperature in celcius");
//        float Tempc = input.nextFloat();
//        float Tempf = (Tempc * 9/5) + 35 ;
//        System.out.println("The temperature in fahaernite in " + Tempf);
//
//    }
    //password checker
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String password = "";
//        while (!password.equals("paras007")) {
//            System.out.println("Enter Password");
//            password = input.nextLine();
//        }
//        System.out.println("access granted");
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter first number");
//        float a = input.nextFloat();
//        System.out.println("enter second number");
//        float b = input.nextFloat();
//        System.out.println("enter third number");
//        float c = input.nextFloat();
//        float max = a;
//        if(b>max){
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }
//        System.out.println(max);
//    }
    //case check
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        char ch = input.next().trim().charAt(0);
//        if(ch>='a' && ch<='z' ){
//            System.out.println("lower case");
//        }
//        else{
//            System.out.println("upper case");
//        }

    //fibonaaci
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        for ( int count = 0 ; count<=num ; count++){
            int temp = b;
            int c = a + b;
            a = temp;
            b = c;
        }
        System.out.println(b);
//
//
    }
    // counting occurrence
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int count = 0;
//        while(n>0){
//            int rem = n%10;
//            if(rem==2){
//                count++;
//            }
//            n=n/10;
//
//        }
//        System.out.println(count);
//    }
    //reverse
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int ans = 0 ;
//        while(n>0){
//            int rem = n%10;
//            ans = ans*10 + rem;
//            n= n /10 ;
//        }
//        System.out.println(ans);
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a fruit");
//        String fruit = input.next();
//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruits");
//            case "banana" -> System.out.println("a yellow fruit");
//            case "apple" -> System.out.println("An apple a day keeps the doctor away");
//            default -> System.out.println("enter another fruit");
////        }
//    }





}
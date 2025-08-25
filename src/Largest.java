import java.util.Scanner;

public class Largest {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        /* 1st meathod */
//        int max = a;
//        if(b>max){
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }
//        System.out.println(max);
        //2nd meathod
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);

    }
}

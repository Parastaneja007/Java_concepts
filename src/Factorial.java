import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int ans = 1;
        for(int i = 1 ; i<=n ; i++){
            ans = ans*i;
        }
        System.out.println(ans);
    }
}

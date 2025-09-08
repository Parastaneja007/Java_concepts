import java.util.Arrays;
import java.util.Scanner;
public class Array_1d {
    public static void main(String[] args) {
        //declaration of array
//        int[] roll_no;
        Scanner input = new Scanner(System.in);
        int[] roll_no = new int[4];
        //declaration
//        int[] marks = {20,18,35,56};
//        roll_no[0] = 23;
//        roll_no[1] = 65;
//        roll_no[2] = 68;
//        roll_no[3] = 12;
//        marks[2] = 67;
//        System.out.println(marks[2]);
//        System.out.println(roll_no[3]);
        //length of array
//        System.out.println(roll_no.length);
        // transversing array
//        for(int i = 0 ; i < roll_no.length ; i++){
//            System.out.println(roll_no[i]);
//        }
        // taking input manually
        for( int i = 0 ; i < roll_no.length; i ++ ){
            roll_no[i] = input.nextInt();
        }
            System.out.println(Arrays.toString(roll_no));
    }
}

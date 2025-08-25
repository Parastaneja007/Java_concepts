import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1 ;
        while(start < end){
            swap(arr , start , end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
//        int[][] matrix = new int[3][3];
//        Scanner input = new Scanner(System.in);
//        for( int row = 0 ; row < matrix.length ; row++){
//            for( int col = 0 ; col< matrix[row].length ; col++){
//                matrix[row][col] = input.nextInt();
//            }
//
//        }
//        for( int row = 0 ; row < matrix.length ; row++){
//            for( int col = 0 ; col< matrix[row].length ; col++){
//                System.out.print(matrix[row][col]);
//            }
//            System.out.println();
//
//        }
//
        int[][] matrix2 ={
                {1 , 12 , 14},
                {2 , 14 , 22 , 43 },
                {4 , 56 }
        };
//        for ( int row = 0 ; row < matrix2.length ; row++){
//            for(int col = 0 ; col< matrix2[row].length ; col++){
//                System.out.print(matrix2[row][col] + " ");
//            }
//            System.out.println();
//        };
        // enhanced for loop
        for(int[] a : matrix2){
            System.out.println(Arrays.toString(a));
        }

    }
}

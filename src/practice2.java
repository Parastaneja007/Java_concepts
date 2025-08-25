import java.util.Scanner;
import java.util.Arrays;
public class practice2 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[][] matrix = new int[3][3];
//        for(int row = 0 ; row < matrix.length ; row++){
//            for(int col = 0 ; col < matrix[row].length ; col++){
//                matrix[row][col] = input.nextInt();
//            }
//        }
//        for(int row = 0 ; row < matrix.length ; row++){
//            for( int col = 0 ; col< matrix[row].length ; col++){
//                System.out.print(matrix[row][col] + " ");
//            }
//            System.out.println();
//        }
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int[][] matrix2 = new int[i][j];
        for(int row = 0 ; row < matrix2.length ; row++){
            for(int col = 0 ; col < matrix2[row].length ; col++){
                matrix2[row][col] = input.nextInt();
            }
        }
        for(int row = 0 ; row < matrix2.length ; row++){
            for( int col = 0 ; col < matrix2[row].length ; col++){
                System.out.print(matrix2[row][col] + " ");
            }
            System.out.println();
        }

    }
}

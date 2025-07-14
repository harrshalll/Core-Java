import java.util.Arrays;
import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        //INPUT
        int arr[][] = new int[3][3];
        Scanner in = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
/*
1. DECLARATION:
   int[][] arr = new int[3][2];
   → Creates a 2D array with 3 rows and 2 columns (3x2 matrix)
   → Stored in heap memory; 'arr' reference is stored in stack

2. MEMORY STRUCTURE:
   - 'arr' is a reference stored in stack memory
   - The actual 2D array (matrix) is stored in heap memory as an array of 1D arrays
   - arr[0], arr[1], arr[2] are separate 1D arrays

   Example:
     arr = [
       [0, 0],
       [0, 0],
       [0, 0]
     ]

3. INPUT USING NESTED FOR LOOPS:
   Outer loop: for each row → arr.length gives number of rows
   Inner loop: for each column → arr[row].length gives columns in that row
   Example:
       for (int row = 0; row < arr.length; row++) {
           for (int col = 0; col < arr[row].length; col++) {
               arr[row][col] = in.nextInt(); // takes input from user
           }
       }

4. OUTPUT:
     a. Row-wise output using Arrays.toString():
       for (int row = 0; row < arr.length; row++) {
           System.out.println(Arrays.toString(arr[row]));
       }

5. EXAMPLE INPUT:
   If you input: 1 2 3 4 5 6
   Then the matrix will be:
   [1, 2]
   [3, 4]
   [5, 6]
*/

import java.util.Arrays;
public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        int[][] nums = {{1,2,3},
                        {4,5,6,}};

    }
}
/*
NOTES
[ STACK ]                               [ HEAP ]
-----------                             ----------------------------------
arr ─────┐                              arr --> [ ─────┬────── ]
         │                                        ↓         ↓
         └───────────────────────────────────▶ [1, 2, 3]   [4, 5, 6]
                                             (arr[0])    (arr[1])

arr[0] = [1, 2, 3]
            ↑
         arr[0][0] = 1
         arr[0][1] = 2
         arr[0][2] = 3

arr[1] = [4, 5, 6]
            ↑
         arr[1][0] = 4
         arr[1][1] = 5
         arr[1][2] = 6

 */
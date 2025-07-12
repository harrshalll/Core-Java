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
nums ─────┐                              nums --> [ ─────┬────── ]
         │                                        ↓         ↓
         └───────────────────────────────────▶ [1, 2, 3]   [4, 5, 6]
                                             (nums[0])    (nums[1])

nums[0] = [1, 2, 3]
            ↑
         nums[0][0] = 1
         nums[0][1] = 2
         nums[0][2] = 3

nums[1] = [4, 5, 6]
            ↑
         nums[1][0] = 4
         nums[1][1] = 5
         nums[1][2] = 6

 */
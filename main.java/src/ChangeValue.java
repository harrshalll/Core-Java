import java.util.Arrays;
public class ChangeValue {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[]nums){
        nums[0] = 99;
    }
}
/*
Note
primitive Type : In primitive type, parameter points to the copy of passed value.
Reference type : In reference type, both arr(in main) and nums(in change()) point to the same array in memory.
i.e. change in nums value cause the change in arr also.
 */
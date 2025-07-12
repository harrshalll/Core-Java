import java.util.Arrays;
public class PassingFunctionArray {
    public static void main(String[] args) {
        int[] num = {2, 3, 4, 56, 89};
        System.out.println(Arrays.toString(num));
        change(num);//REFERENCE TYPE ARGUMENT AND PARAMETER.
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr){
        arr[3] = 45;
    }
}

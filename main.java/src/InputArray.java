import java.util.Arrays;
import java.util.Scanner;
public class InputArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        in.nextLine();
        // ENHANCED FOR LOOP/ FOR-EACH LOOP
        Scanner sc = new Scanner(System.in);
        String[] names = new String[4];
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }
        for(String name : names){
            System.out.println(name);
        }
        names[2] = "Iron Man";
        System.out.println(Arrays.toString(names));

    }
}

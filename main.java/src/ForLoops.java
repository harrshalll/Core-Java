import java.util.Scanner;
public class ForLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    Scanner input = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = input.nextInt();
        for (int num = 0; num < n; num++) {
            System.out.println(num);
        }

    }
}

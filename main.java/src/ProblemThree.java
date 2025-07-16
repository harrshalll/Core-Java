// factorial program
import java.util.Scanner;
public class ProblemThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= f ; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}

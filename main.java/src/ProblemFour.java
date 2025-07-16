//multiplication table
import java.util.Scanner;

public class ProblemFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tableno = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            int table = tableno * i;
            System.out.println(table);
        }
    }
}

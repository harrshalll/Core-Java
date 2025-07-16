import java.util.Scanner;

public class ProblemSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        System.out.println("Prime numbers up to " + p + ":");

        for (int i = 2; i <= p; i++) {
            boolean isPrime = true;


            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

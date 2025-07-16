
import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int q = 0;
        for (int i = 0; i <= N; i++) {
            q += i;
        }
        System.out.println(q);

        System.out.println(wh());
    }
    static int wh(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = 0;
        int j = 0;
        while (j<=n){
            w = w + j;
            j++;
        }
        return w;
    }
}

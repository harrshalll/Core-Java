import java.util.Scanner;
public class ProblemOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println(i);
        }
        System.out.println(wh());
        dowh();
    }


    static int wh(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 0;
        while (j<n){
          System.out.println(j);
            j++;
        }
        return j;
    }
    static void dowh(){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int k = 0;
        do {
            System.out.println(k);
            k++;
        }while(k<m);
    }
}



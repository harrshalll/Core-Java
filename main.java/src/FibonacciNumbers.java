import java.util.Scanner;
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0; //---> actual fibonacci number
        int b = 1; //---> actual fibonacci number
        int count = 2; //----> index of fibonacci number like f(0) = 0, f(1) = 1, f(2) = 1, f(3) = 2
        while(count<=n){
            int temp = b;
            b = b + a;//----> b updates value after each iteration
            a = temp;
            count++;
        }
        System.out.print(b);
    }
}

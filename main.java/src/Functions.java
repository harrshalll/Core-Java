import java.util.Scanner;
// function or methods ---> block of code which is reusable.
public class Functions {
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1 = in.nextInt();
        System.out.print("Enter num2:");
        int num2 = in.nextInt();
        System.out.println("sum : "+(num1 + num2));
    }
    public static void main(String[] args) {
        sum();
        sum();
    }
}
//return type--->
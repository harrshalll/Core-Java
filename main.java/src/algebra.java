import java.util.Scanner;

public class algebra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1 = input.nextInt();
        System.out.print("Enter num2:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum : "+sum);
        input.nextLine();
    // adding to floats
        System.out.print("Enter f1:");
        float f1 = input.nextFloat();
        System.out.print("Enter f2:");
        float f2 = input.nextFloat();
        float add = f1 + f2;
        System.out.println("addition: "+add);
    // fun
        System.out.print("enter n1");
        int n1 = input.nextInt();
        System.out.print("enter n2");
        int n2 = input.nextInt();
        System.out.print("addition is " + (n1+n2));



    }
}

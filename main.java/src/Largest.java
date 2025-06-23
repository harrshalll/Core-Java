import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = input.nextInt();
        System.out.print("Enter b:");
        int b = input.nextInt();
        System.out.print ("Enter c:");
        int c = input.nextInt();

        //Q. Find the largest among 3 numbers
        int max = a;
        if(max<b){
            max = b;
        } if (max<c) {
            max = c;
        }
        System.out.println("Largest num: " +max);

    }
}

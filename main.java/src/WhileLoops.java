import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter p : ");
        int p = input.nextInt();
        int i = 0;
        while(i <= p){
            System.out.println(i);
            i++;
        }
    }
}
//Note: Use While loop when we don't know how many times it will iterate
// and Use For loop when we know how many times loop will iterate.
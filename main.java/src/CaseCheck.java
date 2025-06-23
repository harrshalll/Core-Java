import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Character:");
        char ch = in.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {// &&----> it defines the range.
            System.out.println("this is lowercase" + ch);
        }
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("this is UPPER CASE");

        }
    }
}

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Fruit Name:");
        String fruit = in.next();

       switch(fruit){
           case "Mango":
               System.out.println("King of Fruits");
               break;
           case "Apple":
               System.out.println("A sweet red fruits");
               break;
           case "Orange":
               System.out.println("A round orange fruit");
               break;
           default:
               System.out.println("Invalid Case");
       }

    }
}
/* note:
1.cases have to be same type as expression(here string)
2.duplicate case values are not allowed.
3.default will execute when none of the above does.
4.if default is not at the end, put the break after to terminate the program. */



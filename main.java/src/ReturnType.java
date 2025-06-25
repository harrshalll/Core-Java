import java.util.Scanner;
public class ReturnType {
    static int algebra(){   //----> return type int = it returns the int value
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1 = in.nextInt();
        System.out.print("Enter num2:");
        int num2 = in.nextInt();
        return num1 + num2; // ---->whenever return statement hits it indicates end of function call. whatever we write
                              //  after return will not execute.
    }
    static String code(){  //----> return type String = it returns the String value
        return "Hello Coder";
    }
    static void nothing(){   //----> return type void = it returns null/nothing
        return;
    }
    static void everything(){  //----> return type void = it returns null but can print anything which return inside
                                                            // block of function
        System.out.println("Everything");
        return;
    }
    public static void main(String[] args) {
        System.out.println(algebra()); // ----> call the method/function.
        System.out.println(code());
        nothing(); // ----> we don't have to use sout in main() function to call function of void return type
        everything();
    }
}

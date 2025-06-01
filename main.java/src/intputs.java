// taking inputs of different datatypes

import java.util.Scanner ;
public class intputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//this line is to create object from class scanner
        System.out.print("Please enter some int input:");
        int rollno = input.nextInt();  //reads the input int
        System.out.println("Your roll number is " +rollno);

        int a = 1;// identifiers --> any class,object and variable we named
        // literal-->actual data

        input.nextLine();/* --> this line consumes the leftover after pressing enter key. If we doesn't use this line
        then we cannot enter the input string and system gives us empty string*/
// taking string input
       String name = input.nextLine();
       System.out.println(name);

       float cgpa = input.nextFloat();
        System.out.println(cgpa);
    }
}

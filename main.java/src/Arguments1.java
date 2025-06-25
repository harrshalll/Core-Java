// arguments--->pass the value of numbers when you are calling the function in main()
public class Arguments1 {
    static int multiply(int num1 ,int num2){
        System.out.print("multiplication:");
        return num1 * num2;
    }

    public static void main(String[] args) {
        System.out.println(multiply(2,4));//----> In main() function = passing the values.
    }
}

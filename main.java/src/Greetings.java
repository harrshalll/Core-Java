public class Greetings {
    static String Greeting(){
        return "Hello Java";
    }
    static int num(){
        return 25;
    }
 /* static int num2(){
        int a = 6;
        int b = 10;
        System.out.print("Multiplication: " );
        return a * b;
    }*/
    // or above code can write as
    static int num2(){
        int a = 6;
        int b = 10;
        return a * b;
    }
    public static void main(String[] args) {
        System.out.println(Greeting());
        System.out.println(num());
        System.out.println("multiplication: " +num2());
    }
}

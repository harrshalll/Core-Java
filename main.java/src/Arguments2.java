import java.util.Scanner;
public class Arguments2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your naam:");
        String naam = in.next();
        System.out.println(myself(naam));
        System.out.println(self("Harshal Avhad"));
    }
    static String self(String Name){
        String message = "Hello " + Name;
        return message;
    }
    static String myself(String naam){
        String message1 = "Hello " + naam;
        return message1;
    }
}

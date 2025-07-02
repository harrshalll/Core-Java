public class Shadowing {
    static int x = 90; // This is a class variable. It can be accessed in any method of the class. However, if a local
    // variable with the same name is declared in a method, it will shadow (hide) the class variable within that method.
    public static void main(String[] args) {
        System.out.println(x);// 90
        int x = 100;
        System.out.println(x);// 100//---> local variable shadowed class variable int x = 90; here
        fun();
    }
    static void fun(){
        System.out.println(x);// 90
    }
}

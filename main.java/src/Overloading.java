public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Harshal Avhad");
        sum(2,3,9);
    }
    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b,int c){
        System.out.println(a + b + c);
        return a + b + c;
    }
}
/* In method overloading : parameter should be of different data types or if they are of same type then number of
 parameter should be different .
 At compile time: system decides which method/function to run.

 */
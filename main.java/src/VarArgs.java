import java.util.Arrays;
public class VarArgs {// variable length arguments----> taking variable number of arguments
    public static void main(String[] args) {
        fun(2,20,40,60,80);//--->taking variable number of arguments of integer.
        fun2("Harshal", "Shashank","Utpam", "Manav");//--->taking variable number of arguments of String.
        mix(20,30, "Iron Man", "Tony Stark");
    }
    static void fun(int ...v){// if you don't know how many variable to take use ellipsis(...) for it. it stores the variable in
        // the form of array internally.
        System.out.println(Arrays.toString(v));
    }
    static void fun2(String ...s){
        System.out.println(Arrays.toString(s));
    }
    static void mix(int a, int b, String...t){
        System.out.print("a = " + a);
        System.out.print(" b = " + b);
        System.out.println(Arrays.toString(t));
    }
    /*
    static void demo(String name, int... nums) // valid
    static void demo(int... nums, String name) // ❌ invalid ellipsis(...)should be at last in arguments.

     */
}

public class Passing {
    public static void main(String[] args) {
        String name = "Harshal Avhad";
        introduce(name);
    }
    static void introduce(String naam){
        System.out.println(naam);
    }
}
/* Notes
In java there is only passed by value ---> let's take above example to understand. we take name ref.variable in main()
function and stores its value and call the introduce method by using ref.variable name(argument) but in method block of
 code we used the naam parameter. so when you call the introduce method by using argument it internally take the copy of
 value i.e."Harshal Avhad" and also passed this value in naam parameter
step:1
 main method:
────────────
String name = "Harshal Avhad";

Memory:
┌────────────┐
│ name       │───► "Harshal Avhad"
└────────────┘
step 2:
greet(name);
You're calling greet() and passing the value inside name, which is "Harshal Avhad".


step 3:
greet method:
────────────
String naam = "Harshal Avhad";  ← value from name

Memory:
┌────────────┐
│ naam       │───► "Harshal Avhad"
└────────────┘
Now the method creates a new local variable called naam, and puts the same value into it.

Even though the name is different, it still refers to "Harshal Avhad"
 */
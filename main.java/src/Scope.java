public class Scope {
    public static void main(String[] args) {
        int a = 10;// we can access int a and b only inside main function outside main function it is not valid.
        int b = 20;
        System.out.println("sum " +(a+b));
    }
    static int scope(int marks){// we can access this marks in parameter only inside this method
        int maths_marks = 98;// here also we access maths_marks only inside this method.
        return maths_marks;
    }

}
/*
Scoping---->A variable is only accessible within the block ({}) in which it was declared.
That means:
1.A variable declared inside a method and parameter of method is not accessible outside that method.

2.A variable declared inside an if, for, while, or block is only accessible inside that block.




 */
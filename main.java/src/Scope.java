public class Scope {
    public static void main(String[] args) {
        int a = 10;// we can access int a and b only inside main function outside main function it is not valid.
        int b = 20;

        {// block scope
            //int a = 78; // already initialized outside the block in the same function/method.
            a = 100;// reassign/updating the original ref variable to some other value
            System.out.println(a);
            int c = 99;// value initialized in this block will remain in the block.
        }
        // int c = 900;
        //System.out.println(c);//---> cannot use outside the block.
        System.out.println(a);
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

3.Anything initialized outside the block cannot initialize again in block but can update/reassign it. eg, int a . But
anything used inside the block cannot use outside the block eg. int c .

4.Anything initialized inside the block can initialize outside the block.(eg. int c)


 */
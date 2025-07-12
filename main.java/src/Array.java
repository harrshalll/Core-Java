import java.util.Arrays;
//Array---> collection of same datatypes.
public class Array {
    public static void main(String[] args) {
        //Q. store a roll no.
        int a = 2;

        //Q. store a name.
        String name = "Harshal Avhad";

        //Q. store 5 roll nos.
        int[] roll_no = new int[5];// new keyword is used to create an object in heap memory, just like [new Scanner]
                                   //when we take input of anything.
        //or
        int[] roll_no2 = {1,25,36,25,45};
                //stack     object
        System.out.println(Arrays.toString(roll_no2));


        int[] rno; // declaration of array. rnp is getting defined in the stack.Happens at compile time.
        rno = new int[5];// initialization: actually here object is being created inside the memory(heap memory).at run time


        String[] arr = new String[4];//NULL--->This object reference doesn’t point to anything.
        System.out.println(arr[0]);

        double[] price = new double[3];
        price[0] = 9.99;
        price[1] = 10.99;
        price[2] = 11.99;
        //[9.99, 10.99, 11.99]
        System.out.println(Arrays.toString(price));
        System.out.println(price.length);

        //taking a String array
        String[] cities = new String[2];//DECLARATION OF STRING ARRAY
        cities[0] = "Mumbai";// INITIALIZATION OF STRING ARRAY
        cities[1] = "Delhi";
        System.out.println(Arrays.toString(cities));

        //or

        String[] names = {"Harshal", "Chandrakant" ,"Sunanda" ,"Shraddha"};// DECLARATION AND INITIALIZATION IN ONE STEP
        System.out.println(Arrays.toString(names));

        
    }
}
/*
Notes:
1. Array objects are stored in heap memory.
2. Heap objects in java are not continuous.
3. Array stores via Dynamic Memory Allocation.
4. In Java Array may not be continuous because it depends on jvm.
 */
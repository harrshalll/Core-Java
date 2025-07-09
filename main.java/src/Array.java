import java.util.Arrays;
//Array---> collection of same datatypes.
public class Array {
    public static void main(String[] args) {
        //Q. store a roll no.
        int a = 2;

        //Q. store a name.
        String name = "Harshal Avhad";

        //Q. store 5 roll nos.
        int[] roll_no = new int[5];// new keyword is used to create an object  in heap memory.
        //or
        int[] roll_no2 = {1,25,36,25,45};
                //stack     object
        System.out.println(Arrays.toString(roll_no2));


        int[] rno; // declaration of array. rnp is getting defined in the stack.Happens at compile time.
        rno = new int[5];// initialization: actually here object is being created inside the memory(heap memory).at run time


        String[] arr = new String[4];
        System.out.println(arr[0]);
        
    }
}
/*
Notes:
1. Array objects are stored in heap memory.
2. Heap objects in java are not continuous.
3. Array stores via Dynamic Memory Allocation.
4. In Java Array may not be continuous because it depends on jvm.
 */
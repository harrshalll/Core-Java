public class Strings {
    public static void main(String[] args) {
        Student student = new Student();//student is reference variable which store the object of Student class in heap memory.
        student.name = "Vipul";
        student.address = "INDIA";
        student.standard = 4;
        student.rollNo = 1;
        int l = 1;
        char ch = 'a';
        boolean isPassed = true;
        String x = "Ram";//String is sequence of character
        String a = new String(x);
        String b = new String(x);
        String c = "Ram";
        String d = "Ram";
        /*
        if we use new keyword creating string it creates to different object in heap memory
        You are passing x (which points to "Ram" in the String Pool) as an instruction. The constructor looks at x, reads
        its exact sequence of characters ('R', 'a', 'm'), and initializes your brand-new Heap object with a perfect copy of that text 📝.
        So, a and b do not maintain any ongoing connection to x. They simply used x as a template or a photocopy original
        at the moment they were created.
         */
        System.out.println(b == a);
        /*
        so means if String c is created by using literal it stores in String pool, and again we created string d with literal
         it doesn't create another string pool. instead of d also points to the c. that means in string pool x,c and d points to same string
         */
        System.out.println(a.equals(b));
        /*
        == checks Identity (Location 📍): It asks, "Do these two variables point to the exact same physical spot in memory?"
        Since a and b are separate objects sitting at different addresses in the Heap, a == b is false.
        .equals() checks Content (Value 📝): It asks, "Is the sequence of characters inside these objects identical?"
        It opens up object a, reads "Ram", opens up object b, reads "Ram", and sees that the text matches perfectly. Therefore, a.equals(b) is true.
         */
        System.out.println(c == d);
        System.out.println(x);
    }
}
class Student{
    String name;
    String address;
    int rollNo;
    int standard;
}
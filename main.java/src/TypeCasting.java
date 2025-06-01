
//TypeCasting is nothing but type conversion
//con1:two data types must be compatible
/*con2:destination type should be greater than source type i.e. data in int is lesser as compare to float coz float have
 decimal number*/
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = (int)(98.87f);//-->explicit/narrow TypeCasting
        System.out.println(a);
        float i = 35;
        System.out.println(i);//-->implicit/widening TypeCasting
    }
}
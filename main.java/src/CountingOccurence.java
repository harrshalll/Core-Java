import java.util.Scanner;
/*there are two ways to find counting occurence
1st = convert the datatypes from int to string and iterate over the all char.
2nd = divide the given number by 10 remainder tells about counting occurence .
 */
public class CountingOccurence {
    public static void main(String[] args) {
       int n = 1223322552;
       int count = 0;
       while (n > 0){
           int remainder = n % 10;
           if(remainder ==2){
               count++;
           }
           n = n / 10;
       }
        System.out.println(count);
    }

}

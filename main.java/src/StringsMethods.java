public class StringsMethods {
    public static void main(String[] args) {
        String name = "Harsh";
        String name2 = "harsh";
        int length = name.length();
        char c = name.charAt(length-1);
        System.out.println(name.equals(name2));//is string is same but case is different then gives false
        System.out.println(name.equalsIgnoreCase(name2));//ignore the cases, only checks if string is equal or not.


        String str1 = "remote";// ctrl + shift + d + u --> change the case of string
        String  str2 = "car";
        int i = str1.compareTo(str2);//it compares both the string and gives difference between ascii value
        System.out.println(i);

        String naam = "Amar Panchal";
        String subString = naam.substring(2,7);//starting index and ending index of substring
        String newSurname = naam.replace("Panchal","Sharma");
        System.out.println(newSurname);
        System.out.println(subString);

        String str = " ";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        //difference between blank and empty is empty method counts the space character but blank does not
    }
}
//In java string is immutable, whatever method use on this string will create the new string

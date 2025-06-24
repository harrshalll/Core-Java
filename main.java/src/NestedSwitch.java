import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter EmpID:");
        int empID = in.nextInt();
        in.nextLine();
        String Department = in.next();


        switch(empID){
            case 1:
                System.out.println("Harshal Avhad");
                switch(Department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "HR":
                        System.out.println("HR Department");
                        break;
                    case "Account":
                        System.out.println("Accounts Department");
                        break;
                    default:
                        System.out.println("Please enter valid Department");
                }
                break;

            case 2:
                System.out.println("Shashank Bankar");
                switch(Department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "HR":
                        System.out.println("HR Department");
                        break;
                    case "Account":
                        System.out.println("Accounts Department");
                        break;
                    default:
                        System.out.println("Please enter valid Department");
                }
                break;
            case 3:
                System.out.println("Elon Musk");
                switch(Department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "HR":
                        System.out.println("HR Department");
                        break;
                    case "Account":
                        System.out.println("Accounts Department");
                        break;
                    default:
                        System.out.println("Please enter valid Department");
                }
                break;
            default:
                System.out.println("Please Enter Correct empID");
        }


    }
}

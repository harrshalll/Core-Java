public class IfStatements{
    public static void main(String[] args) {
        //syntax of if statements
        int salary = 20000000;
        if(salary < 30000000){
            salary = salary + 50000;
        }
        else{
            salary = salary + 2000;
        }
        System.out.println(salary);

        //syntax of else_if statement
        int new_salary = 2000;
        if (new_salary > 1999){
            new_salary += 2000;
        }
        else if(new_salary > 2000){
            new_salary += 2500;
        }
        else{
            new_salary -=12;
        }
        System.out.println(new_salary);
    }
}

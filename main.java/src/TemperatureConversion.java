import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in farenheit: ");
        float temperature = input.nextFloat();
        float temperature_in_celcius = (temperature - 32) * 5/9;
        System.out.println(temperature_in_celcius);
    }
}

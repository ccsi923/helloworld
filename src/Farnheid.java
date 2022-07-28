import java.util.HashMap;
import java.util.Scanner;

public class Farnheid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a Fahrenheit - Celsius calculator:");
        System.out.println("Write the temperature in Fahrenheit:");
        double fh = sc.nextDouble();

        double convertValue = convertFarenheit(fh);
        System.out.println("Fahrenheit: " + fh + " are " + convertValue + " celsius");
    }

    public static double convertFarenheit(double degrees){
        return (degrees - 32) * (5.0/9);
    }
}

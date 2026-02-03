
import java.util.Scanner;

class TempConv {
    public double celToFah(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

public class asst8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        TempConv converter = new TempConv();
        double fahrenheit = converter.celToFah(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        sc.close();
    }
}
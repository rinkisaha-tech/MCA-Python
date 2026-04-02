//Design a java program that functions as a data coversion utility using wrapper classes.
import java.util.Scanner;
public class asst33 {
    static  void strToInt(String input){
        try{
            int value = Integer.parseInt(input);
            System.out.println("String to integer: " + value);
        }
        catch (NumberFormatException e){
            System.out.println("Invalid numeric string...");
        }
    }

    static void intToDbl(int num){
        Double d = Double.valueOf(num);
        System.out.println("Integer to double: " + d);
    }

    static void numToStr(int num){
        String str = String.valueOf(num);
        System.out.println("NUmber to String: " + str);
    }

    static  void strToDbl(String input){
        try{
            Double value = Double.parseDouble(input);
            System.out.println("String to double: " + value);
        }
        catch (NumberFormatException e){
            System.out.println("Invalid ...");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Data Conversion ");

        System.out.println("Enter numeric string: ");
        String text = sc.nextLine();
        strToInt(text);
        strToDbl(text);

        System.out.println("Enter integer value: ");
        int number  = sc.nextInt();
        intToDbl(number);
        numToStr(number);

        sc.close();   
    }
}
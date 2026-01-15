//develop a menu driven calculator application using java control structure

import java.util.Scanner;
class demo {

    int add(int a,int b){
        return a+b;        
    }
    int subtract(int a, int b){
        return a-b;
    }
    int div(int a, int b){
        return a/b;
    }
    int multi(int a, int b){
        return a*b;
    }
}
public class asst3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        do{
            System.out.println("******---MENU DRIVEN CALCULATOR---******");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.End");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            
            if (choice>=1 && choice<=4) {
            System.out.println("Enter 1st num: ");
            int a = sc.nextInt();

            System.out.println("Enter 2nd num: ");
            int b = sc.nextInt();
            
            demo d = new demo();
            double res;
            switch (choice) {
                case 1:
                    res= d.add(a, b);
                    System.out.println("Result: "+ res);
                    break;
                case 2:
                    res = d.subtract(a, b);
                    System.out.println("Result: "+ res);
                    break;
                case 3:
                    System.out.println("Result: "+ d.multi(a, b));
                    break;
                case 4:
                    d.div(a, b);
                    System.out.println("Result: "+ d.add(a, b));
                    break;

                default:
                    break;
                }
            }
            else if (choice == 5) {
                System.out.println("Existing Calculator");
            }else{
                System.out.println("Invalid Choice!!!!!!");
            }
        }
        while (choice !=5);
    }
}

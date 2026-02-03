import java.util.Scanner;
class swapping{
    int num1, num2;

    void getData(int n1, int n2){
        num1 = n1;
        num2 = n2;
    }
    void swapData(){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.printf("\nNum1 : %d, Num2: %d",num1,num2);
    }
}
public class asst9 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter first number(num1): ");
        num1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter second number(num2): ");
        num2 = sc.nextInt();
        sc.nextLine();

        swapping swap = new swapping();
        swap.getData(num1, num2);
        swap.swapData();
    }
}
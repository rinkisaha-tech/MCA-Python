//Create a java program that analyze a number entered by a user.

import java.util.Scanner;
class number{
    int num;
    void get_num(int num){
        this.num = num;
    }
    //positive negative check
    void p_n_zCheck(){
        if(num == 0){
            System.out.println("Number is Zero..!!!");
        }else if (num >0) {
            System.out.println("Number is positve..!!!");
        }else{
            System.out.println("Number is negative..!!!");
        }
    }

    //odd even check
    void oddEven(){
        if (num%2==0) {
            System.out.println("Number is Even..!!!");
        }else{
            System.out.println("Number is Odd..!!!");
        }
    }

    //prime check
    void primeCheck(){
        if (num<=1) {
            System.out.println("Number is not prime..!!!");
            return;
        }

        boolean isPrime = true;
        for (int i=2; i<=(num/2);i++) {
            if(num%i==0){
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Number is prime..!!!");
        }else{
            System.out.println("Number is notprime..!!!");
        }
    }

    void palindromCheck(){
        if (num <0) {
            System.out.println("This is not palindrome");
        }
        int r = num;
        int rev =0;
        while (num!= 0) {
            int d=num%10;
            rev=(rev*10)+d;
            num/=10;
        }
        if (r==rev) {
            System.out.println("Number is palindrome..!!!");
        }else{
            System.out.println("Number is not palindrome..!!!");
        }
    }
}

public class numCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        number obj = new number();
        obj.get_num(num);
        obj.p_n_zCheck();
        obj.oddEven();
        obj.primeCheck();
        obj.palindromCheck();
    }
}
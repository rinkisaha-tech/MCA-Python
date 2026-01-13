/*develop a java program that store the details of an employee in suitable variable and display 
the data back to the user in a well formatted structure, the program should accept details such as id,
emp name, designation, salary, company name store them temporarily in memory and then retrieve and print 
them to demonstrate input processing and structured output representation use get data(), to take inputs and 
show data() to display them.
 */
import java.util.Scanner;
class info{
    int id;
    String name;
    String desig;
    int sal;
    String compName;

    void getData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your Name: ");
        name = sc.nextLine();

        System.out.print("Enter your Designation: ");
        desig = sc.nextLine();

        System.out.print("Enter your salary: ");
        sal = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your Company Name: ");
        compName = sc.nextLine();
    }

    void showData(){
        System.out.println("****#******#****EMPLOYEE DETAILS****#******#****");
        System.out.println("Emp ID: "+id);
        System.out.println("Emp name: "+name);
        System.out.println("Emp designation: "+desig);
        System.out.println("Emp salary: "+sal);
        System.out.println("Company Name: "+compName);
        System.out.println("*****#******#******THANK YOU******#******#*****");

    }
}
public class asst5 {
    public static void main(String[] args) {
        info obj = new info();
        obj.getData();
        obj.showData();
    }
}

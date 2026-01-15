/*design a java program that display a simple personal profile on the console. The program should store basic information such as name, age,
 course, and instituition in appropriate variables and display them using formatted output structure.

*/
import java.util.Scanner;
class info{
    String name;
    int id;
    int age;
    String course;
    String inst;

    void getData(){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter your Name: ");
        name = sc.nextLine();

        System.out.print("Enter your ID: ");
        id = sc.nextInt();
        sc.nextLine();


        System.out.print("Enter your Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your Course: ");
        course = sc.nextLine();

        System.out.print("Enter your Instituition Name: ");
        inst = sc.nextLine();
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Age: "+age);
        System.out.println("Course: "+course);
        System.out.println("Instituition Name : "+inst);
    
    }
}

public class asst7 {
    public static void main(String[] args) {
        info obj = new info();
        obj.getData();
        obj.display();
    }
}

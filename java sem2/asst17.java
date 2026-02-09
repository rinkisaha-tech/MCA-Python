import java.util.Scanner;
abstract class shape{
    abstract double calArea();
}
class circle extends shape{
    double rad;
    circle(double rad){
        this.rad=rad;
    }
    double calArea(){
        return(3.14159*rad*rad);
    }
}
class rect extends shape{
    double len, breadth;
    rect(double l, double b){
        len=l;
        breadth=b;
    }
    double calArea(){
        return len*breadth;
    }
}
class tri extends shape{
    double base, height;
    tri(double base, double h){
        this.base=base;
        this.height=h;
    }
    double calArea(){
        return 0.05*base*height;
    }
}

public class asst17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of a circle: ");
        shape s1=new circle(sc.nextDouble());
        System.out.println("Enter length and breadth for rectangle: ");
        shape s2 = new rect(sc.nextDouble(),sc.nextDouble());
        System.out.println("Enter base and height: ");
        shape s3 = new tri(sc.nextDouble(), sc.nextDouble());
        System.out.println("\nArea of a circle : "+s1.calArea());
        System.out.println("\nArea of a rectangle : "+s2.calArea());
        System.out.println("\nArea of a triangle : "+s3.calArea());

    }
}
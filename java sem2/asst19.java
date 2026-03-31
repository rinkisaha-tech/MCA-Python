class employee{
    int id;
    String name;
    double sal;

    void setDetails(int id, String n, double sal){
        this.id=id;
        name=n;
        this.sal=sal;
    }

    void displayDetails(){
        System.out.println("Emp Id: "+id);
        System.out.println("Emp Name: "+name);
        System.out.println("Emp Salary: "+sal);
    }
}

public class asst19 {

    public static void main(String[] args) {
        employee e = new employee();
        e.id=41;
        e.name="Rinki";
        e.sal=0.00;
        System.out.println("Accessing data memebers directly...");

        e.displayDetails();
        System.out.println("Accessing data members using methods...");

        employee e2=new employee();
        e2.setDetails(42, "Jinat", 0);
        e2.displayDetails();
    }
}



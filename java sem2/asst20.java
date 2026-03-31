class prod{
    int pId;
    String pName;
    double price;
    int quantity;
    prod(int id, String name, double p, int q){
        pId=id;
        pName=name;
        price=p;
        quantity=q;
    }
    double calTotal(){
        return price*quantity;
    }
    void display(){
        System.out.println("Product id: "+pId);
        System.out.println("Product name: "+pName);
        System.out.println("Product price: "+price);
        System.out.println("Product quantity: "+quantity);
        System.out.println("Total cost: "+calTotal());
    }
}

public class asst20 {

    public static void main(String[] args) {
        prod p1=new prod(1, "palatte", 40, 5);
        prod p2=new prod(2, "Brush", 50, 10);
        p1.display();
        p2.display();
    }
}
// Q22. Develop a java program to demonstrate multilevel inheritance.

class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class asst22   {
    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.eat();
        obj.bark();
        obj.weep();
    }
}
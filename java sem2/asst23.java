//Q23. Write a java program to demonstrate runtime polymorphism using base class references.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
public class asst23 {
    public static void main(String[] args) {

        Animal obj;

        obj = new Animal();
        obj.sound();

        obj = new Dog();
        obj.sound();

        obj = new Cat();
        obj.sound();
    }
}
package Inheritance;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",0);

        Dog dog = new Dog("Abby", 25);
        dog.sound();

        Cat cat = new Cat("Flossy", 10);
        cat.sound();
    }
}

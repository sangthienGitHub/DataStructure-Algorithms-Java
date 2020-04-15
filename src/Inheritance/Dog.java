package Inheritance;

public class Dog extends Animal {
    public Dog(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void sound() {
        System.out.println("Bark");
        super.sound();
    }
}

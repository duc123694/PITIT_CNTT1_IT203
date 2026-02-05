package ex4;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
        // animal.run();
        if (animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.run();
        }
    }
}

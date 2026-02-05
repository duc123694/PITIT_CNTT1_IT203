package ex4;

public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void run() {
        System.out.println("Dog is running");
    }
}
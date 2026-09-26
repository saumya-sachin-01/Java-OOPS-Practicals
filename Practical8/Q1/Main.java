package Practical8.Q1;

public class Main {
    static void main() {
        Animal a1 = new Dog("Bull",1);
        Animal a2 = new Cow("Cow",8);
        Animal a3 = new Cat("Cat",1);
        a1.sound();
        a2.sound();
        a3.sound();
    }
}

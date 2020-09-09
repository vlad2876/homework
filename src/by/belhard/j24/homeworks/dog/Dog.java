package by.belhard.j24.homeworks.dog;

public class Dog {
    String name;
    String breed;

    Dog(String name, String breed) {

    }

    public void bark() {
        System.out.println("Woof - woof!");
    }

    public void play(String item) {
        System.out.println("Dog is playing with a " + item + " now");
    }

    public void guard(String place) {
        System.out.println("Dog is guarding the " + place + " now");
    }

    public void sleep() {
        System.out.println("Dog goes to sleep");
    }
}


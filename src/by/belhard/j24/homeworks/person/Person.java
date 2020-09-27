package by.belhard.j24.homeworks.person;

public class Person {
    String name;
    int age;
    Cat pet;

    public Person(String name, int age, Cat pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Dog dog = new Dog();
    Fish fish = new Fish();

    public void playWithPet() {
        pet.play();
    }
    public void playWithDog() {
        dog.play();
    }
    public void playWithFish() {
        fish.play();
    }

}

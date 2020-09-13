package by.belhard.j24.homeworks.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Vlad", 18, new Cat("Barsik"));
        person.playWithPet();
    }
}

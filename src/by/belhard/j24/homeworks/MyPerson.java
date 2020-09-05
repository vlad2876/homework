package by.belhard.j24.homeworks;

public class MyPerson {
    public static void main(String[] args) {

        Person p1 = new Person("Stepan", 23, Sex.MALE, new Country("Russia", 238357));
        Person p2 = new Person("Vasily", 36, Sex.MALE, new Country("UK", 488323));
        p1.eat("Meat");
        p2.growOld();
        p2.walk();
        System.out.println("Vasily is " + p2.age + " years old");
    }
}

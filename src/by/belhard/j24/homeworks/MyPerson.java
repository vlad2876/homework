package by.belhard.j24.homeworks;

public class MyPerson {
    public static void main(String[] args) {

        Person p1 = new Person("Stepan", 23, Sex.MALE, new Country("Russia", 238357));
        System.out.println(p1.country.title);

        Person p2 = new Person("Vasily", p1.age, Sex.MALE, new Country("UK", 488323));
        System.out.println(p2.country.title);
    }
}

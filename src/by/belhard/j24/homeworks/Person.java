package by.belhard.j24.homeworks;

public class Person {
    String name;
    int age;
    Country country;
    Sex sex;

    Person p1 = new Person("Stepan", 23, Sex.MALE, "Russia", 258357);


    public Person(String name, int age, Sex sex, String countryName, int countryZipCode) {
        this.name = name;
        this.age = age;
        this.country = new Country(countryName, countryZipCode);
        this.sex = sex;
    }

    public void walk() {
        System.out.println(this.name + " is walking.");
    }

    public void eat(String dish) {
        System.out.println(this.name + " is eating " + dish);
    }

    public int growOld() {
        return ++age;
    }
}

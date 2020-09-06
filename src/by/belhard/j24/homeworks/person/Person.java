package by.belhard.j24.homeworks.person;

public class Person {

    public String name;
    public int age;
    Country country;
    Sex sex;


    public Person(String name, int age, Sex sex, Country country) {
        this.name = name;
        this.age = age;
        this.country = country;
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


    public void say() {
        System.out.println("Hello");
    }
}
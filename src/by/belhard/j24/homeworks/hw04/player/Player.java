package by.belhard.j24.homeworks.hw04.player;

public class Player {
    String name;
    int age;
    int height;
    Coordinates coordinates;

    public Player(String name, int age, int height, Coordinates coordinates) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.coordinates = coordinates;
    }

    public void motion(int newX, int newY) {
        System.out.println(this.name + " is moved from x-" + coordinates.x + " y-" + coordinates.y + " to x-" + newX + " y-" + newY );
        System.out.println("And walked along the x for " + (newX - coordinates.x) + ", along the y for " + (newY - coordinates.y));
    }


}
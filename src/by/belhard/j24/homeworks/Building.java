package by.belhard.j24.homeworks;

public class Building {
    String type;
    int year;
    String material;
    Address address;
    int floor;
    boolean lift;

    public Building(String type, int year, String material, int floor, boolean lift, Address address) {
        this.type = type;
        this.year = year;
        this.material = material;
        this.address = address;
        this.floor = floor;
        this.lift = lift;
    }

    public Building() {
    }
}

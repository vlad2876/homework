package by.belhard.j24.homeworks.building;

public class MyBuilding {
    public static void main(String[] args) {
        Building factory = new Building("Factory", 2005, "Brick", 3, false, new Address("Moskovskaya str.", 32));

        Building office = new Building("Office", 2014, "Block", 21, true, new Address("Kizhevatova str.", 25));

    }
}

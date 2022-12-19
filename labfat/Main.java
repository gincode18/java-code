class Building {
    // Data Members
    private String name;
    private String city;
    private int year;
 
    // Constructor
    public Building(String n, String c, int y) {
        name = n;
        city = c;
        year = y;
    }
 
    // Getters
    public String getName() {
        return name;
    }
 
    public String getCity() {
        return city;
    }
 
    public int getYear() {
        return year;
    }
}
 
class Auditorium extends Building {
    // Data Members
    private int seatingCapacity;
    private float perHourCharge;
 
    // Constructor
    public Auditorium(String n, String c, int y, int s, float p) {
        super(n, c, y);
        seatingCapacity = s;
        perHourCharge = p;
    }
 
    // Getters
    public int getSeatingCapacity() {
        return seatingCapacity;
    }
 
    public float getPerHourCharge() {
        return perHourCharge;
    }
}
 
class School extends Building {
    // Data Members
    private int numOfClassrooms;
 
    // Constructor
    public School(String n, String c, int y, int nc) {
        super(n, c, y);
        numOfClassrooms = nc;
    }
 
    // Getters
    public int getNumOfClassrooms() {
        return numOfClassrooms;
    }
}
 
class BuildingsGroup<T> {
    // Data Members
    private T[] buildings;
    private int numOfBuildings;
 
    // Constructor
    public BuildingsGroup(int n) {
        buildings = (T[]) new Object[n];
        numOfBuildings = 0;
    }
 
    // Methods
    public void addBuilding(T b) {
        buildings[numOfBuildings] = b;
        numOfBuildings++;
    }
 
    public T getOldestBuilding() {
        T oldest = buildings[0];
        for (int i = 1; i < numOfBuildings; i++) {
            if (((Building) buildings[i]).getYear() < ((Building) oldest).getYear()) {
                oldest = buildings[i];
            }
        }
 
        return oldest;
    }
 
    public void sortByName() {
        for (int i = 0; i < numOfBuildings - 1; i++) {
            for (int j = 0; j < numOfBuildings - i - 1; j++) {
                if (((Building) buildings[j]).getName().compareToIgnoreCase(((Building) buildings[j + 1]).getName()) > 0) {
                    T temp = buildings[j];
                    buildings[j] = buildings[j + 1];
                    buildings[j + 1] = temp;
                }
            }
        }
    }
 
    public String toString() {
        String str = "";
        for (int i = 0; i < numOfBuildings; i++) {
            str += buildings[i] + "\n";
        }
 
        return str;
    }
}
 
public class Main {
    public static void main(String[] args) {
        // Create an array of 5 buildings
        BuildingsGroup<Building> buildings = new BuildingsGroup<>(5);
 
        // Add some auditoriums and schools to the array
        buildings.addBuilding(new Auditorium("Audi 1", "Dhaka", 2010, 50, 200));
        buildings.addBuilding(new Auditorium("Audi 2", "Dhaka", 2015, 100, 300));
        buildings.addBuilding(new School("Sch 1", "Chittagong", 2012, 10));
        buildings.addBuilding(new School("Sch 2", "Chittagong", 2014, 20));
 
        System.out.println("Buildings:");
        System.out.println(buildings);
 
        // Get the oldest building
        System.out.println("Oldest building:");
        System.out.println(buildings.getOldestBuilding());
 
        // Sort buildings by name
        buildings.sortByName();
        System.out.println("Buildings sorted by name:");
        System.out.println(buildings);
    }
}
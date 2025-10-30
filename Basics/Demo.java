class Building {

    private int floors = 10;

    // Non-static inner class
    class FirstFloor {
        void displayFloor() {
            System.out.println("There are a total of " + floors + " in this building.");
            System.out.println("My apartment is on floor 1");
        }
    }
}

public class Demo {
    public static void main(String[] args) {

        Building apt1 = new Building();

        // Create inner class instance using the outer class instance
        Building.FirstFloor firstFloor = apt1.new FirstFloor();

        // Call the method
        firstFloor.displayFloor();
    }
}

/*
 * There are a total of 10 in this building.
   My apartment is on floor 1
 */
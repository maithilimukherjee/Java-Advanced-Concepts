package CollegeAssignments;

public class CopyDemo {

    private int length;
    private int breadth;
    private int perimeter;

    // Regular constructor
    public CopyDemo(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;   
        this.perimeter = 2 * (length + breadth);
    }

    // Copy constructor
    public CopyDemo(CopyDemo object) {
        System.out.println("Copy Constructor called");
        this.length = object.length;
        this.breadth = object.breadth;
        this.perimeter = object.perimeter;
    }

    // Compare perimeters
    public void comparePerimeter(CopyDemo object) {
        if (this.perimeter > object.perimeter) {
            System.out.println("Current object has a greater perimeter");
        } else if (this.perimeter < object.perimeter) {
            System.out.println("Passed object has a greater perimeter");
        } else {
            System.out.println("Both objects have equal perimeter");
        }
    }

    // Check if dimensions are equal
    public boolean isEqualDimension(CopyDemo object) {
        return this.length == object.length && this.breadth == object.breadth;
    }
}

// Separate main class
class CopyDemoMain {
    public static void main(String[] args) {
        CopyDemo obj1 = new CopyDemo(4, 5);
        CopyDemo obj2 = new CopyDemo(obj1); // copy constructor

        obj1.comparePerimeter(obj2);

        if (obj1.isEqualDimension(obj2)) {
            System.out.println("Both objects have equal dimensions");
        } else {
            System.out.println("Objects have different dimensions");
        }
    }
}

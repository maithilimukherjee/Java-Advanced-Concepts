package CollegeAssignments;

public class Box3 {

    private double length;
    private double width;
    private double height;

    public Box3(Box3 box)
    {
        this.length = box.length;
        this.width = box.width;
        this.height = box.height;
    }
    
    public Box3(double l, double w, double h)
    {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public double volume()
    {
        return length * width * height;
    }

}

class Box3Main
{
    public static void main(String[] args) {
        Box3 box1 = new Box3(2.0, 3.0, 4.0);
        Box3 box2 = new Box3(box1);

        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2 (copied from box1): " + box2.volume());
    }
}

/*
 * Volume of box1: 24.0
Volume of box2 (copied from box1): 24.0
 */
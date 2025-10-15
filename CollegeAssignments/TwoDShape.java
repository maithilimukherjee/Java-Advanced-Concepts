package CollegeAssignments;

public abstract class TwoDShape {
    abstract double area();
    protected int dim1;
    protected int dim2;
}

class Rectangle extends TwoDShape
{
    Rectangle(int l, int b)
    {
        dim1 = l;
        dim2 = b;
    }

    double area()
    {
        return dim1 * dim2;
    }
}

class Main2D
{
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 10);
        System.out.println("Area of Rectangle 1: " + rect1.area());
        Rectangle rect2 = new Rectangle(3, 7);
        System.out.println("Area of Rectangle 2: " + rect2.area());
    }
}

/*
Output
 * Area of Rectangle 1: 50.0
Area of Rectangle 2: 21.0
 */
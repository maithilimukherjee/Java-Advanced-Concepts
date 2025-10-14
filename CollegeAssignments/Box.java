package CollegeAssignments;

public class Box {
    
    int length;
    int width;
    int height;

    public void setData(int l, int w, int h){
        length = l;
        width = w;
        height = h;
    }

    public int volume(){
        return length * width * height;
    }

    public static void main(String[] args) {
        Box box = new Box();

        System.out.println("Printing volume of the rectangle 10 x 5 x 2");
        box.setData(10, 5, 2);
        int volRec = box.volume();
        System.out.println("Volume is: " + volRec);

        System.out.println("Printing the volume of the cube: 5 x 5 x 5");
        box.setData(5, 5, 5);
        int volCube = box.volume();
        System.out.println("Volume is: "+volCube);

        if (volRec > volCube) {
            System.out.println("Volume of rectangle is greater than cube");
        } else if (volRec < volCube) {
            System.out.println("Volume of cube is greater than rectangle");
        } else {
            System.out.println("Both volumes are equal");
        }
    }

}

/*
 * Output:
 * Printing volume of the rectangle 10 x 5 x 2
Volume is: 100
Printing the volume of the cube: 5 x 5 x 5
Volume is: 125
 */

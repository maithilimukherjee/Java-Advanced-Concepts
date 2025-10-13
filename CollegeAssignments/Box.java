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
        System.out.println("Volume is: " + box.volume());

        System.out.println("Printing the volume of the cube: 5 x 5 x 5");
        box.setData(5, 5, 5);
        System.out.println("Volume is: " + box.volume());

    }

}

/*
 * Output:
 * Printing volume of the rectangle 10 x 5 x 2
Volume is: 100
Printing the volume of the cube: 5 x 5 x 5
Volume is: 125
 */

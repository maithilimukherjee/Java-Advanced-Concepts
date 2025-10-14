package CollegeAssignments;

public class Box2 {
    
    private int length;
    private int width;
    private int height;

    public Box2(){
        length = 0;
        width = 0;
        height = 0;
    }

    public Box2(int l, int w, int h){
        length = l;
        width = w;
        height = h;
    }
    public int volume(){
        return length * width * height;
    }
}

class MainBox {
    public static void main(String[] args) {
        Box2 box1 = new Box2();
        Box2 box2 = new Box2(5, 5, 5);

        System.out.println("Volume of box1 (default dimensions): " + box1.volume());
        System.out.println("Volume of box2 (5 x 5 x 5): " + box2.volume());

        if (box1.volume() > box2.volume()) {
            System.out.println("Volume of box1 is greater than box2");
        } else if (box1.volume() < box2.volume()) {
            System.out.println("Volume of box2 is greater than box1");
        } else {
            System.out.println("Both volumes are equal");
        }
    }
}

/* Output:
 * Volume of box1 (default dimensions): 0
Volume of box2 (5 x 5 x 5): 125
Volume of box2 is greater than box1
 */
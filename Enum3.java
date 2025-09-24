enum Laptops {
    DELL(20000),
    HP(40000),
    MACBOOK(80000),
    ASUS(30000), 
    LENOVO(25000);

    private int price;

    // Constructor
    private Laptops(int price) {
        this.price = price;
    }

    // Getter
    public int getPrice() {
        return price;
    }
}

public class Enum3 {
    public static void main(String[] args) {
        Laptops laptop = Laptops.MACBOOK;
        System.out.println("Selected Laptop: " + laptop);
        System.out.println("Price: " + laptop.getPrice());
    }
}

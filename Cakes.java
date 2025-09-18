/*
 * This code aims to demonstrate polymorphism in Java without inheritance using method overloading
 */

 public class Cakes{

    public static void display(String flavour, String size)
    {
        System.out.println(flavour+" Cake ordered.");
        System.out.println("Size: "+size);
    }

    public static void display(String flavour)
    {
        System.out.println(flavour+" Cake ordered.");
    }

    public static void display()
    {
        System.out.println("Choco Volcano Cake Ordered.");
    }

    public static void main(String[] args)
    {
        System.out.println("Order cakes!");
        display("Chocolate","Bento");
        display("Red Velvet");
        display();
    }
 }

 /*
  * Order cakes!
Chocolate Cake ordered.
Size: Bento
Red Velvet Cake ordered.
Choco Volcano Cake Ordered.
  */
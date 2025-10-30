abstract class X{
    public abstract void showX();
}

public class XDemo
{
    public static void main(String a[])
    {
        X obj = new X() {
            public void showX() {
                
                System.out.println("This is an implementation of abstract method");
            }
        };
        obj.showX();
    }
}
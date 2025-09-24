@FunctionalInterface
interface A{
    void show();
}

/*class B implements A{
    public void show(){
        System.out.println("In show method");
    }
}*/

public class LambdaJava {
    public static void main(String[] args)
    {
        A obj = () -> System.out.println("In show method");

        obj.show();
    }
}
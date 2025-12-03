public class genMethod {
    
    public static<T> void display(T element)
    {
        System.out.println("Element: " + element);
    }
}

class main{
    public static void main(String[] args)
    {
        genMethod.display(100);
        genMethod.display("Hello Generics");
        genMethod.display(45.67);
    }
}
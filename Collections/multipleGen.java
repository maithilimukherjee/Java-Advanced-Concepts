public class multipleGen<T, U>
{
    T obj1;
    U obj2;

    multipleGen(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1()
    {
        return this.obj1;
    }

    public U getObj2()
    {
        return this.obj2;
    }

    public void displayTypes()
    {
        System.out.println("Type of T: " + obj1.getClass().getName());
        System.out.println("Type of U: " + obj2.getClass().getName());
    }

    public static void main(String[] args)
    {
        
        multipleGen<Integer, String> pair = new multipleGen<Integer, String>(47, "Maithili");
        pair.displayTypes();

        System.out.println("Value of T: " + pair.getObj1());
        System.out.println("Value of U: " + pair.getObj2());
    }
    
}

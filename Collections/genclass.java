public class genclass<T>
{
    T obj;

    genclass(T obj)
    {
        this.obj = obj;
    }

    public T getObj()
    {
        return this.obj;
    }

}

class GenclassDemo
{
    public static void main(String[] args)
    {
        genclass<Integer> intObj = new genclass<Integer>(88);
        System.out.println("Integer Value: " + intObj.getObj());

        genclass<String> strObj = new genclass<String>("Generics Example");
        System.out.println("String Value: " + strObj.getObj());
    }
}
abstract class A{

    public abstract void display();

}

class DemoAbstractClass extends A{

    public void display(){
        System.out.println("This is an implementation of abstract method");
    }

    public static void main(String[] args) {
        DemoAbstractClass obj = new DemoAbstractClass();
        obj.display();
    }
}
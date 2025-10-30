public class MLInherit {
    public void display() {
        System.out.println("Hello, I am the parent class!");
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.display();

        NextGen nextGen = new NextGen();
        nextGen.display();
    }
}

class ChildClass extends MLInherit {
    @Override
    public void display() {
        super.display();
        System.out.println("Hey, I am the child class!");
    }
}

class NextGen extends ChildClass {
    @Override
    public void display() {
        super.display();
        System.out.println("Hey, I am the next generation class!");
    }
}

/*
 * Output:
 * Hello, I am the parent class!
Hey, I am the child class!
Hello, I am the parent class!
Hey, I am the child class!
Hey, I am the next generation class!
 */
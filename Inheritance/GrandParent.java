//this code will demonstrate order of constructor calling in multilevel inheritance in java
public class GrandParent{
    GrandParent(){
        System.out.println("Hello, I am the grandparent class!");
    }
}

class ParentClass extends GrandParent{
    ParentClass(){
        System.out.println("Hey, I am the parent class!");
    }
}

class ChildClass extends ParentClass{
    ChildClass(){
        System.out.println("Hey, I am the child class!");
    }
}

class ConstructorDemo{
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
    }
}

/*
 * Hello, I am the grandparent class!
Hey, I am the parent class!
Hey, I am the child class!
 */
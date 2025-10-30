interface Animal {
    void eat();
    void sleep();
}

class Deer implements Animal {
    @Override
    public void eat() {
        System.out.println("Deer is eating grass.");
    }

    @Override
    public void sleep() {
        System.out.println("Deer is sleeping.");
    }
}

class Owl implements Animal {
    @Override
    public void eat() {
        System.out.println("Owl is eating mice.");
    }

    @Override
    public void sleep() {
        System.out.println("Owl is sleeping during the day.");
    }
}

public class Animals {
    public static void main(String[] args) {
        Animal deer = new Deer();
        deer.eat();
        deer.sleep();

        Animal owl = new Owl();
        owl.eat();
        owl.sleep();
    }
}

/*
 * Output:
 * Deer is eating grass.
 * Deer is sleeping.
 * Owl is eating mice.
 * Owl is sleeping during the day.
 */
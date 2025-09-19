import java.util.ArrayList;
import java.util.Iterator;

// Simple Name class
class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Abstract aggregate
interface NameList {
    Iterator<Name> createIterator();
}

// Concrete aggregate
class YourName implements NameList {
    private ArrayList<Name> names;

    public YourName() {
        names = new ArrayList<Name>();
    }

    public void addName(Name name) {
        names.add(name);
    }

    @Override
    public Iterator<Name> createIterator() {
        return names.iterator();
    }
}

// Demo class
class NameDemo {
    public static void main(String[] args) {
        YourName yn = new YourName();
        yn.addName(new Name("Taylor Swift"));
        yn.addName(new Name("Tate McRae"));
        yn.addName(new Name("SZA"));

        Iterator<Name> it = yn.createIterator();
        while (it.hasNext()) {
            Name n = it.next();
            String name = n.getName();
            System.out.println("Name: " + name);
        }
    }
}

/*
 * Name: Taylor Swift
Name: Tate McRae
Name: SZA
 */
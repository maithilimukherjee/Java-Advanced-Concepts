import java.util.*;

// custom collection interface
public interface CollectionInt<E> extends Iterable<E> {

    // add an element to the collection
    void add(E element);

    // get element at a specific index
    E get(int index);

    // remove last element (or you can define your own meaning)
    void remove();
}


// implementation of our custom interface
class MyCollection<E> implements CollectionInt<E> {

    // using a simple arraylist internally to store data
    private ArrayList<E> list = new ArrayList<>();


    @Override
    public void add(E element) {
        list.add(element); // add element to arraylist
    }


    @Override
    public E get(int index) {
        return list.get(index); // return element at index
    }


    @Override
    public void remove() {
        // remove the last element (you can change logic if needed)
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }


    @Override
    public Iterator<E> iterator() {
        // this lets us use for-each loop
        return list.iterator();
    }
}


// driver class
class Main {
    public static void main(String[] args) {

        // using our custom collection
        MyCollection<String> mc = new MyCollection<>();

        mc.add("hello");
        mc.add("world");
        mc.add("java");

        System.out.println(mc.get(0)); // prints: hello
        System.out.println(mc.get(1)); // prints: world

        mc.remove(); // removes "java"

        // using iterable to loop
        for (String s : mc) {
            System.out.println(s);
        }
    }
}

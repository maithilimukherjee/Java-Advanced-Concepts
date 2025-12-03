import java.util.*;

// our own list interface (don't confuse it with java.util.list)
public interface List<T> extends Collection<T> {

    // add a roll number
    void addRoll(T element);

    // search if a roll number exists
    void searchRoll(T element);

    // remove the last roll number
    void removeRoll();

    // get roll at a position
    void getRoll(int index);

    // get index of a roll
    void getPosRoll(T element);
}


// implementation class
class RollList<T> implements List<T> {
    
    private ArrayList<T> rolls = new ArrayList<>();


    @Override
    public void addRoll(T element) {
        rolls.add(element);
        System.out.println("added: " + element);
    }

    @Override
    public void searchRoll(T element) {
        if (rolls.contains(element)) {
            System.out.println("roll found: " + element);
        } else {
            System.out.println("roll not found: " + element);
        }
    }

    @Override
    public void removeRoll() {
        if (!rolls.isEmpty()) {
            T removed = rolls.remove(rolls.size() - 1);
            System.out.println("removed: " + removed);
        } else {
            System.out.println("no rolls to remove");
        }
    }

    @Override
    public void getRoll(int index) {
        if (index >= 0 && index < rolls.size()) {
            System.out.println("roll at index " + index + " is " + rolls.get(index));
        } else {
            System.out.println("invalid index");
        }
    }

    @Override
    public void getPosRoll(T element) {
        int pos = rolls.indexOf(element);
        if (pos != -1) {
            System.out.println("position of " + element + " is " + pos);
        } else {
            System.out.println("roll not found");
        }
    }


    // ---- required methods because we extend Collection<T> ----

    @Override
    public int size() {
        return rolls.size();
    }

    @Override
    public boolean isEmpty() {
        return rolls.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return rolls.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return rolls.iterator();
    }

    @Override
    public Object[] toArray() {
        return rolls.toArray();
    }

    @Override
    public <U> U[] toArray(U[] a) {
        return rolls.toArray(a);
    }

    @Override
    public boolean add(T e) {
        // not using this; our custom method is addRoll
        return rolls.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return rolls.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return rolls.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return rolls.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return rolls.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return rolls.retainAll(c);
    }

    @Override
    public void clear() {
        rolls.clear();
    }


    // ---- main driver ----

    public static void main(String[] args) {

        RollList<Integer> r = new RollList<>();

        r.addRoll(101);
        r.addRoll(102);
        r.addRoll(103);

        r.getRoll(1);
        r.getPosRoll(103);

        r.searchRoll(102);
        r.removeRoll();

        r.searchRoll(103);
    }
}

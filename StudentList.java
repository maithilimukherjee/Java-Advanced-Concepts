/* concepts of interface implementation and Iterator class design */

import java.util.ArrayList;
import java.util.Iterator;

// Student class
class Student {
    private int rollno;
    private String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }
}

// Abstract aggregate
interface StudentDetails {
    public Iterator<Student> createIterator();
}

// Concrete aggregate
class StdList implements StudentDetails {
    private ArrayList<Student> students;

    public StdList() {
        students = new ArrayList<Student>();
    }

    public void addStd(Student s) {
        students.add(s);
    }

    @Override
    public Iterator<Student> createIterator() {
        return students.iterator();
    }
}

// Demo class
class IteratorDemo {
    public static void main(String[] args) {
        StdList stdlist = new StdList();
        stdlist.addStd(new Student(101, "Sagnik"));
        stdlist.addStd(new Student(102, "Maithili"));

        Iterator<Student> it = stdlist.createIterator();
        while (it.hasNext()) {
            Student s = it.next();
            int r = s.getRollno();
            String n = s.getName();
            System.out.println("Roll No: " + r + " Name: " + n);
        }
    }
}

/*
 * Output:
 * Roll No: 101 Name: Sagnik
 * Roll No: 102 Name: Maithili
 */

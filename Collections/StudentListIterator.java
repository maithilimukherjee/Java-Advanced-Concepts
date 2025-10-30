import java.util.ArrayList;
import java.util.Iterator;

// Student class
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Main class
public class StudentListIterator {
    public static void main(String[] args) {

        // Create a list of Student objects
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice"));
        studentList.add(new Student("Bob"));
        studentList.add(new Student("Charlie"));
        studentList.add(new Student("David"));

        // Get the iterator
        Iterator<Student> iterator = studentList.iterator();

        System.out.println("Names of students in the class:");
        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println(s.getName());
        }
    }
}

/*
 * Names of students in the class:
Alice
Bob
Charlie
David
 */

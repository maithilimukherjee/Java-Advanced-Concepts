package StudentMVC;
public class StudentMain {
    
    public static void main(String[] args)
    {
        Student model = new Student();
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);
        controller.setStudentName("John Doe");
        controller.setStudentRollNo("12345");
        controller.printData();
    }
}

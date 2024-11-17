// Main Class

public class MVCPatternDemo {
    public static void main(String[] args) {
        
        // Create the Model
        Student student = new Student ("John" , "Doe");

        // Create the View
        StudentView view = new StudentView();

        // Create the Controller with the model and view
        StudentController controller = new StudentController(student, view);

        // Display the initial Student Data
        controller.updateView();

        // Update the Student data using the Controller
        controller.setStudenFirsttName("Jane");
        controller.setStudentLastName("Smith");

        // Display the updated Student data
        System.out.println("\nAfter updating the Student Data: ");
        controller.updateView();
    }
}
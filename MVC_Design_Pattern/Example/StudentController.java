// Controller

public class StudentController {
    private final Student model;
    private final StudentView view;

    // Constructor
    public StudentController (Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Getters
    public String getStudentFirstName () {
        return model.getFirstName();
    }

    public String getStudentLasttName () {
        return model.getLastName();
    }

    // Setters
    public void setStudenFirsttName (String firstName) {
        model.setFirstName(firstName);
    }

    public void setStudentLastName (String lastName) {
        model.setLastName(lastName);
    }

    // Update the View
    public void updateView() {
        view.printStudentDetails (model.getFirstName(), model.getLastName());
    }
}
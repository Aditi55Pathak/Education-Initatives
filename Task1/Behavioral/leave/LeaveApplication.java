import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class LeaveApplication {
    private static final Logger logger = Logger.getLogger(LeaveApplication.class.getName());
    private final List<Department> observers = new ArrayList<>();
    private String studentName;

    public void attach(Department department) {
        if (department == null) {
            throw new IllegalArgumentException("Department cannot be null");
        }
        observers.add(department);
        logger.log(Level.INFO, "Department attached: {0}", department.getClass().getSimpleName());
    }

    private void notifyObservers() {
        observers.forEach(department -> {
            try {
                department.update(studentName);
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Error notifying department: {0}", department.getClass().getSimpleName());
            }
        });
    }

    public void submitApplication(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be null or empty");
        }
        this.studentName = name;
        logger.log(Level.INFO, "Leave application submitted by: {0}", name);
        notifyObservers();
    }
}

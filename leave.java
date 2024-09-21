import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

// Leave Application in College
// Pattern: Observer (Behavioral)
// Description: Notify different departments when a leave application is submitted.

interface Department {
    void update(String studentName);
}

class HRDepartment implements Department {
    private static final Logger logger = Logger.getLogger(HRDepartment.class.getName());

    @Override
    public void update(String studentName) {
        logger.log(Level.INFO, "HR notified about leave application from: {0}", studentName);
    }
}

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

class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LeaveApplication leaveApplication = new LeaveApplication();
        leaveApplication.attach(new HRDepartment());

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter student name to submit leave application (or type 'exit' to quit): ");
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) {
                    logger.log(Level.INFO, "Exiting application.");
                    break;
                }
                try {
                    leaveApplication.submitApplication(input);
                } catch (Exception e) {
                    logger.log(Level.SEVERE, "Error submitting leave application", e);
                }
            }
        }
    }
}

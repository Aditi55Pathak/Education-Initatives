// Leave Application in College

// Pattern: Observer (Behavioral)
// Description: Notify different departments when a leave application is submitted.

// LeaveApplication.java
import java.util.ArrayList;
import java.util.List;

class LeaveApplication {
    private List<Department> observers = new ArrayList<>();
    private String studentName;

    public void attach(Department department) {
        observers.add(department);
    }

    public void notifyObservers() {
        for (Department department : observers) {
            department.update(studentName);
        }
    }

    public void submitApplication(String name) {
        this.studentName = name;
        System.out.println("Leave application submitted by: " + name);
        notifyObservers();
    }
}

// Department.java (Observer)
interface Department {
    void update(String studentName);
}

// HRDepartment.java
class HRDepartment implements Department {
    @Override
    public void update(String studentName) {
        System.out.println("HR notified about leave application from: " + studentName);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        LeaveApplication leaveApplication = new LeaveApplication();
        leaveApplication.attach(new HRDepartment());
        
        leaveApplication.submitApplication("John Doe");
    }
}

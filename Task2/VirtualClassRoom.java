import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Classroom {
    private static final Logger logger = Logger.getLogger(Classroom.class.getName());
    private String name;
    private List<String> students;
    private List<String> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public void addStudent(String studentId) {
        if (studentId == null || studentId.isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be null or empty");
        }
        students.add(studentId);
        logger.log(Level.INFO, "Student {0} has been enrolled in {1}.", new Object[]{studentId, name});
    }

    public void scheduleAssignment(String assignment) {
        if (assignment == null || assignment.isEmpty()) {
            throw new IllegalArgumentException("Assignment cannot be null or empty");
        }
        assignments.add(assignment);
        logger.log(Level.INFO, "Assignment for {0} has been scheduled.", name);
    }

    public List<String> getStudents() {
        return students;
    }

    public List<String> getAssignments() {
        return assignments;
    }
}

class VirtualClassroomManager {
    private static final Logger logger = Logger.getLogger(VirtualClassroomManager.class.getName());
    private Map<String, Classroom> classrooms;

    public VirtualClassroomManager() {
        classrooms = new HashMap<>();
    }

    public void addClassroom(String className) {
        if (className == null || className.isEmpty()) {
            throw new IllegalArgumentException("Class name cannot be null or empty");
        }
        if (classrooms.containsKey(className)) {
            throw new IllegalArgumentException("Classroom already exists.");
        }
        classrooms.put(className, new Classroom(className));
        logger.log(Level.INFO, "Classroom {0} has been created.", className);
    }

    public void addStudent(String studentId, String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new IllegalArgumentException("Classroom does not exist.");
        }
        classroom.addStudent(studentId);
    }

    public void scheduleAssignment(String className, String assignment) {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new IllegalArgumentException("Classroom does not exist.");
        }
        classroom.scheduleAssignment(assignment);
    }

    public void submitAssignment(String studentId, String className, String assignment) {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            throw new IllegalArgumentException("Classroom does not exist.");
        }
        if (!classroom.getAssignments().contains(assignment)) {
            throw new IllegalArgumentException("Assignment does not exist.");
        }
        logger.log(Level.INFO, "Assignment submitted by Student {0} in {1}.", new Object[]{studentId, className});
    }
}

class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        VirtualClassroomManager manager = new VirtualClassroomManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine().trim();
            String[] commands = input.split(" ");

            try {
                switch (commands[0]) {
                    case "add_classroom":
                        if (commands.length != 2) {
                            throw new IllegalArgumentException("Usage: add_classroom <class_name>");
                        }
                        manager.addClassroom(commands[1]);
                        break;
                    case "add_student":
                        if (commands.length != 3) {
                            throw new IllegalArgumentException("Usage: add_student <student_id> <class_name>");
                        }
                        manager.addStudent(commands[1], commands[2]);
                        break;
                    case "schedule_assignment":
                        if (commands.length != 3) {
                            throw new IllegalArgumentException("Usage: schedule_assignment <class_name> <assignment>");
                        }
                        manager.scheduleAssignment(commands[1], commands[2]);
                        break;
                    case "submit_assignment":
                        if (commands.length != 4) {
                            throw new IllegalArgumentException("Usage: submit_assignment <student_id> <class_name> <assignment>");
                        }
                        manager.submitAssignment(commands[1], commands[2], commands[3]);
                        break;
                    case "exit":
                        scanner.close();
                        logger.log(Level.INFO, "Exiting application.");
                        return;
                    default:
                        System.out.println("Invalid command. Please try again.");
                }
            } catch (Exception e) {
                logger.log(Level.SEVERE, "An error occurred: " + e.getMessage(), e);
            }
        }
    }
}
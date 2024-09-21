import java.util.logging.Level;
import java.util.logging.Logger;

class HRDepartment implements Department {
    private static final Logger logger = Logger.getLogger(HRDepartment.class.getName());

    @Override
    public void update(String studentName) {
        logger.log(Level.INFO, "HR notified about leave application from: {0}", studentName);
    }
}

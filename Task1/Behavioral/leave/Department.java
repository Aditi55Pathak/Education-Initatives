// Leave Application in College
// Pattern: Observer (Behavioral)
// Description: Notify different departments when a leave application is submitted.

import java.util.logging.Level;
import java.util.logging.Logger;

interface Department {
    void update(String studentName);
}


import java.util.logging.Level;
import java.util.logging.Logger;

public class CrimeDatabase {
    private static final Logger logger = Logger.getLogger(CrimeDatabase.class.getName());

    public void recordCrime(String crimeType) {
        // Simulate recording crime in a database woww
        logger.log(Level.INFO, "Recording crime in database: " + crimeType);
        System.out.println("Recording crime in database: " + crimeType);
    }
}
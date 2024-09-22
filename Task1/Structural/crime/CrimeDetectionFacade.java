import java.util.logging.Level;
import java.util.logging.Logger;

public class CrimeDetectionFacade {
    private static final Logger logger = Logger.getLogger(CrimeDetectionFacade.class.getName());
    private final CrimeDatabase crimeDatabase;
    private final PoliceUnit policeUnit;

    public CrimeDetectionFacade() {
        this.crimeDatabase = new CrimeDatabase();
        this.policeUnit = new PoliceUnit();
    }

    public void reportCrime(String crimeType) {
        logger.log(Level.INFO, "Reporting crime of type: " + crimeType);
        // Simulating crime reporting process
        try {
            Thread.sleep(1000); // Simulate time taken to report crime. Adjust as needed.

            crimeDatabase.recordCrime(crimeType);
            policeUnit.dispatchUnits(crimeType);
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE, "Crime reporting process was interrupted", e);
            Thread.currentThread().interrupt();
        }
        logger.log(Level.INFO, "Crime of type " + crimeType + " reported successfully.");
    }
}
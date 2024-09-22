import java.util.logging.Level;
import java.util.logging.Logger;

public class PoliceUnit {
    private static final Logger logger = Logger.getLogger(PoliceUnit.class.getName());

    public void dispatchUnits(String crimeType) {
        // Simulate dispatching police units to crime spots
        logger.log(Level.INFO, "Dispatching police units for: " + crimeType);
        System.out.println("Dispatching police units for: " + crimeType);
    }
}
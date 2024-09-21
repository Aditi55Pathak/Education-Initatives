// Crime Detection

// Pattern: Facade (Structural)
// Description: Provide a simplified interface for complex crime detection systems.

// CrimeDetectionFacade.java
class CrimeDetectionFacade {
    private CrimeDatabase database;
    private PoliceUnit policeUnit;

    public CrimeDetectionFacade() {
        database = new CrimeDatabase();
        policeUnit = new PoliceUnit();
    }

    public void reportCrime(String crimeType) {
        database.recordCrime(crimeType);
        policeUnit.dispatchUnits(crimeType);
    }
}

// CrimeDatabase.java
class CrimeDatabase {
    public void recordCrime(String crimeType) {
        System.out.println("Recording crime: " + crimeType);
    }
}

// PoliceUnit.java
class PoliceUnit {
    public void dispatchUnits(String crimeType) {
        System.out.println("Dispatching units for crime: " + crimeType);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        CrimeDetectionFacade facade = new CrimeDetectionFacade();
        facade.reportCrime("Robbery");
    }
}

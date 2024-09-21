
public class CrimeDetectionFacade {
    private final CrimeDatabase database;
    private final PoliceUnit policeUnit;

    public CrimeDetectionFacade() {
        this.database = new CrimeDatabase();
        this.policeUnit = new PoliceUnit();
    }

    public void reportCrime(String crimeType) {
        System.out.println("Reporting crime: " + crimeType);
        database.recordCrime(crimeType);
        policeUnit.dispatchUnits(crimeType);
    }
}

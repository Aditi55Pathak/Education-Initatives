
public class Main {
    public static void main(String[] args) {
        CrimeDetectionFacade facade = new CrimeDetectionFacade();
        String crimeType = "Robbery";  // Example crime type
        facade.reportCrime(crimeType);
    }
}

// Missing Children Report

// Pattern: Decorator (Structural)
// Description: Add additional information and features to the missing children report dynamically.

// MissingChildrenReportDecorator.java

// Component Interface
interface Report {
    String getDescription();
}

// Concrete Component
class BasicReport implements Report {
    @Override
    public String getDescription() {
        return "Missing children report.";
    }
}

// Decorator Abstract Class
abstract class ReportDecorator implements Report {
    protected Report report;

    public ReportDecorator(Report report) {
        this.report = report;
    }

    @Override
    public String getDescription() {
        return report.getDescription();
    }
}

// Concrete Decorators
class LocationDecorator extends ReportDecorator {
    private String location;

    public LocationDecorator(Report report, String location) {
        super(report);
        this.location = location;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Location: " + location;
    }
}

class AdditionalInfoDecorator extends ReportDecorator {
    private String additionalInfo;

    public AdditionalInfoDecorator(Report report, String additionalInfo) {
        super(report);
        this.additionalInfo = additionalInfo;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Additional Info: " + additionalInfo;
    }
}

// Main Class
public class MissingChildrenReportDecorator {
    public static void main(String[] args) {
        // Create a basic report
        Report report = new BasicReport();
        
        // Decorate with location
        report = new LocationDecorator(report, "Central Park");
        
        // Decorate with additional info
        report = new AdditionalInfoDecorator(report, "Last seen wearing a red backpack.");
        
        // Print the final report description
        System.out.println(report.getDescription());
    }
}

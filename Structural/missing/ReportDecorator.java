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

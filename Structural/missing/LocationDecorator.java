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

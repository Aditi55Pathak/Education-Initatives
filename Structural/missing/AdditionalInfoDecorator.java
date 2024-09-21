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

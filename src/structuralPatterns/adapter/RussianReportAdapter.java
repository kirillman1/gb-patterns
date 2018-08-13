package structuralPatterns.adapter;

public class RussianReportAdapter implements InternationalReport {

    private RussianReport russianReport;

    public RussianReportAdapter() {
        russianReport = new RussianReport();
    }

    @Override
    public String getEBITDA() {
        return russianReport.getProfit();
    }
}

package structuralPatterns.adapter;

public class InternationalReportGenerator {

    private InternationalReport internationalReport;

    public InternationalReportGenerator() {
    }

    public InternationalReportGenerator(InternationalReport internationalReport) {
        this.internationalReport = internationalReport;
    }

    public void setInternationalReport(InternationalReport internationalReport) {
        this.internationalReport = internationalReport;
    }

    public String generateEBITDA (){
        return internationalReport.getEBITDA();
    }
}

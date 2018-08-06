package creationalPatterns.factoryMethod;

public class MagnitSharesholdersReport implements SharesholdersReport {
    ShareholdersReportType shareholdersReportType;

    public MagnitSharesholdersReport(ShareholdersReportType shareholdersReportType) {
        this.shareholdersReportType = shareholdersReportType;
    }

    public ShareholdersReportType getShareholdersReportType() {
        return shareholdersReportType;
    }
}

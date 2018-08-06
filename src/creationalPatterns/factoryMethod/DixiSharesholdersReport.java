package creationalPatterns.factoryMethod;

public class DixiSharesholdersReport implements SharesholdersReport {

    ShareholdersReportType shareholdersReportType;

    public DixiSharesholdersReport(ShareholdersReportType shareholdersReportType) {
        this.shareholdersReportType = shareholdersReportType;
    }

    public ShareholdersReportType getShareholdersReportType() {
        return shareholdersReportType;
    }
}

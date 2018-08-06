package creationalPatterns.factoryMethod;

public class DixiFactory implements Factory {
    @Override
    public SharesholdersReport create(ShareholdersReportType type) {
        return new DixiSharesholdersReport(type);
    }
}

package creationalPatterns.factoryMethod;

public class MagnitFactory implements Factory {
    @Override
    public SharesholdersReport create(ShareholdersReportType type) {
        return new MagnitSharesholdersReport(type);
    }
}

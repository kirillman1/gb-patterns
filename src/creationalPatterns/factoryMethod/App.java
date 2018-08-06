package creationalPatterns.factoryMethod;

public class App {
    private Factory factory;

    public App(Factory factory) {
        this.factory = factory;
    }

    public void create(){
        SharesholdersReport sharesholdersReport;
        sharesholdersReport = factory.create(ShareholdersReportType.Q1);
        sharesholdersReport = factory.create(ShareholdersReportType.Q2);
        sharesholdersReport = factory.create(ShareholdersReportType.Q3);
        sharesholdersReport = factory.create(ShareholdersReportType.Q4);
        sharesholdersReport = factory.create(ShareholdersReportType.ANNUAL);
    }

    public static void main(String[] args) {
        App app = new App(new MagnitFactory());
        app.create();
    }
}

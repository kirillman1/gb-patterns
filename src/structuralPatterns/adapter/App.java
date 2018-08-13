package structuralPatterns.adapter;

public class App {
    public static void main(String[] args) {
        InternationalReportGenerator internationalReportGenerator = new InternationalReportGenerator(new RussianReportAdapter());
        internationalReportGenerator.generateEBITDA();
    }
}

package creationalPatterns.abstractFactory;

public class FactoryMaker {

    public enum ReportsOwner {
        DIXI, MAGNIT
    }

    public static ReportsFactory createFactory (ReportsOwner reportsOwner) {
        switch (reportsOwner){
            case DIXI:
                return new DixiReportsFactory();

            case MAGNIT:
                return new MagnitReportsFactory();

            default:
                throw new IllegalArgumentException("ReportOwner is not supported");
        }
    }
}

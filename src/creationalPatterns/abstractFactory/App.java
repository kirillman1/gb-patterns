package creationalPatterns.abstractFactory;

public class App {

    private BudgetingReport budgetingReport;
    private CashFlowReport cashFlowReport;
    private PerformanceIndicatorsReport performanceIndicatorsReport;


    public BudgetingReport getBudgetingReport() {
        return budgetingReport;
    }

    public void setBudgetingReport(BudgetingReport budgetingReport) {
        this.budgetingReport = budgetingReport;
    }

    public CashFlowReport getCashFlowReport() {
        return cashFlowReport;
    }

    public void setCashFlowReport(CashFlowReport cashFlowReport) {
        this.cashFlowReport = cashFlowReport;
    }

    public PerformanceIndicatorsReport getPerformanceIndicatorsReport() {
        return performanceIndicatorsReport;
    }

    public void setPerformanceIndicatorsReport(PerformanceIndicatorsReport performanceIndicatorsReport) {
        this.performanceIndicatorsReport = performanceIndicatorsReport;
    }

    public void createReports (ReportsFactory reportsFactory) {
        setBudgetingReport(reportsFactory.createBudgetReport());
        setCashFlowReport(reportsFactory.createCashFlowReport());
        setPerformanceIndicatorsReport(reportsFactory.createPerformanceIndicatorsReport());
    }

    public static void main(String[] args) {
        App app = new App();

        ReportsFactory magnitReportsFactory = FactoryMaker.createFactory(FactoryMaker.ReportsOwner.MAGNIT);
        app.createReports(magnitReportsFactory);

        ReportsFactory dixiReportsFactory = FactoryMaker.createFactory(FactoryMaker.ReportsOwner.DIXI);
        app.createReports(dixiReportsFactory);
    }
}

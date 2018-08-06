package creationalPatterns.abstractFactory;

public class DixiReportsFactory implements ReportsFactory {
    @Override
    public BudgetingReport createBudgetReport() {
        return new DixiBudgetingReport();
    }

    @Override
    public CashFlowReport createCashFlowReport() {
        return new DixiCashFlowReport();
    }

    @Override
    public PerformanceIndicatorsReport createPerformanceIndicatorsReport() {
        return new DixiPerformanceIndicatorsReport();
    }
}

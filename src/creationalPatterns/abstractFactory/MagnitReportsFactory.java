package creationalPatterns.abstractFactory;

public class MagnitReportsFactory implements ReportsFactory {
    @Override
    public BudgetingReport createBudgetReport() {
        return new MagnitBudgetingReport();
    }

    @Override
    public CashFlowReport createCashFlowReport() {
        return new MagnitCashFlowReport();
    }

    @Override
    public PerformanceIndicatorsReport createPerformanceIndicatorsReport() {
        return new MagnitPerformanceIndicatorsReport();
    }
}

package creationalPatterns.abstractFactory;

public interface ReportsFactory {
    BudgetingReport createBudgetReport();
    CashFlowReport createCashFlowReport();
    PerformanceIndicatorsReport createPerformanceIndicatorsReport();
}

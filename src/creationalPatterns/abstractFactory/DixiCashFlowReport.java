package creationalPatterns.abstractFactory;

public class DixiCashFlowReport implements CashFlowReport {
    @Override
    public String getDescription() {
        return "Dixi CashFlow Report";
    }
}

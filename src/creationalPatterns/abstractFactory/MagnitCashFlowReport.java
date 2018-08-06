package creationalPatterns.abstractFactory;

public class MagnitCashFlowReport implements CashFlowReport {
    @Override
    public String getDescription() {
        return "Magnit CashFlow Report";
    }
}

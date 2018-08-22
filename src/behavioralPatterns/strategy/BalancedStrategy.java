package behavioralPatterns.strategy;

public class BalancedStrategy implements InvestmentStrategy{
    @Override
    public void execute() {
        System.out.println("Buy stocks using 80% of portfolio and bonds - 20%");
    }
}

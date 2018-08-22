package behavioralPatterns.strategy;

public class AggressiveStrategy implements InvestmentStrategy {
    @Override
    public void execute() {
        System.out.println("Buy cryptocurrency using 100% of funds");
    }
}

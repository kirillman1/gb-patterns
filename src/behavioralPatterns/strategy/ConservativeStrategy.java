package behavioralPatterns.strategy;

public class ConservativeStrategy implements InvestmentStrategy {
    @Override
    public void execute() {
        System.out.println("Buy bonds using 100% of funds");
    }
}

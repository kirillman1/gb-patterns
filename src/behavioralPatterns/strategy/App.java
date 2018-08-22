package behavioralPatterns.strategy;

public class App {
    public static void main(String[] args) {
        Investor investor = new Investor(new BalancedStrategy());
        investor.invest();

        investor.setInvestmentStrategy(new AggressiveStrategy());
        investor.invest();
    }
}

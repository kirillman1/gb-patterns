package behavioralPatterns.strategy;

public class Investor {

    private InvestmentStrategy investmentStrategy;

    public void invest(){
        investmentStrategy.execute();
    }

    public Investor(InvestmentStrategy investmentStrategy) {
        this.investmentStrategy = investmentStrategy;
    }

    public InvestmentStrategy getInvestmentStrategy() {
        return investmentStrategy;
    }

    public void setInvestmentStrategy(InvestmentStrategy investmentStrategy) {
        this.investmentStrategy = investmentStrategy;
    }
}

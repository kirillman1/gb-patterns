package structuralPatterns.composite;

public class App {
    public static void main(String[] args) {
        Order buyStock = new BuyStocks("AAPL");
        Order sellStock = new SellStocks("AMZN");
        Order stopLoss = new StopLoss("AAPL","160.35");
        Order compositeOrder = new CompositeOrder().add(buyStock,stopLoss, sellStock);
        compositeOrder.perform();
    }
}

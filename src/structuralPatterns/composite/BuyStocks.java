package structuralPatterns.composite;

public class BuyStocks implements Order {

    String stock;

    public BuyStocks(String stock) {
        this.stock = stock;
    }

    @Override
    public void perform() {

    }
}

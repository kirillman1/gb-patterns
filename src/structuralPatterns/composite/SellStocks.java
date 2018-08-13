package structuralPatterns.composite;

public class SellStocks implements Order {

    String stock;

    public SellStocks(String stock) {
        this.stock = stock;
    }

    @Override
    public void perform() {

    }
}

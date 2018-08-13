package structuralPatterns.composite;

public class StopLoss implements Order {

    String stock;
    String price;

    public StopLoss(String stock, String price) {
        this.stock = stock;
        this.price = price;
    }

    @Override
    public void perform() {

    }
}

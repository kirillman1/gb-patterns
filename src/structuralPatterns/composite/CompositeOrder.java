package structuralPatterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeOrder implements Order {

    private List<Order> orders = new ArrayList<>();

    @Override
    public void perform() {
        for (Order order : orders){
            order.perform();
        }
    }

    public Order add (Order... orders){
        this.orders.addAll(Arrays.asList(orders));
        return this;
    }
}

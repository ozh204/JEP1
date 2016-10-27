package domain;

public class Order {
    private String type = "Suchy";
    private double price = 3.5;
    private String topping = "Żadna";

    public Order(String type, double price, String topping)
    {
        this.type = type;
        this.price = price;
        this.topping = topping;
    }
}

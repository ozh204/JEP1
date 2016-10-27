package service;

import domain.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderStorage {
    private List<Order> orders = new ArrayList<Order>();

    public void addOrder(String type, double price, String topping)
    {
        Order order = new Order(type,price,topping);
        orders.add(order);
    }

    public List<Order> getOrders()
    {
        return orders;
    }
}

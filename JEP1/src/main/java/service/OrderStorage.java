package service;

import java.util.ArrayList;
import java.util.List;

import domain.Waffle;

public class OrderStorage {
    private static List<Waffle> orders = new ArrayList<Waffle>();

    public static void addOrder(Waffle waffle)
    {
        orders.add(waffle);
    }

    public static List<Waffle> getOrders()
    {
        return orders;
    }
}

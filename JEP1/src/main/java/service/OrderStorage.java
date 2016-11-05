package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import domain.Waffle;

public class OrderStorage {
    private static List<Waffle> orders = new ArrayList<Waffle>();

    public void addOrder(Waffle waffle)
    {
        orders.add(waffle);
    }

    public static List<Waffle> getOrders()
    {
        return orders;
    }

    public static void deleteOrder(String[] list)
    {
        List<String> idList = new ArrayList<String>();
        idList.addAll(Arrays.asList(list));
        Collections.reverse(idList);

        int id;
        for(String a : idList)
        {
            id = Integer.parseInt(a);
            orders.remove(id-1);
        }
    }

    public void modifyOrder(Waffle waffle, String id)
    {
        orders.set(Integer.parseInt(id)-1,waffle);
    }

    public static boolean checkIfExists(String[] items)
    {
        if(items == null) return false;
        int id;
        for(String a : items)
        {
            id = Integer.parseInt(a);
            if (orders.get(id-1) == null)
                return false;
        }
        return true;
    }
}

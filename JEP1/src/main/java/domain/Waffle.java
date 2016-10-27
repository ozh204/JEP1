package domain;

import service.WaffleTypes;

public class Waffle
{
    private String type = "Suchy";
    private double price = 3.5;
    private String topping = "Brak";
    private String sugar = "Brak";
    private String cream = "Brak";
    private String fruit = "Brak";

    public Waffle() {}

    public Waffle(String type, double price)
    {
        this.type = type;
        this.price = price;
    }

    public String getType()
    {
        return type;
    }
    public double getPrice()
    {
        return price;
    }
    public String getSugar()
    {
        return sugar;
    }
    public String getTopping()
    {
        return topping;
    }
    public String getCream()
    {
        return cream;
    }
    public String getFruit()
    {
        return fruit;
    }



    public void setType()
    {
        WaffleTypes type = new WaffleTypes();
        for (Waffle waffle : type.getAllWaffles()) {
            if(waffle.price == this.price) {this.type = waffle.getType();break;}
        }
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setPrice() {}
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setPrice(String topping, String sugar, String cream, String fruit)
    {
        if(!topping.equals("Brak"))
        {
            this.price += 1.5;
            this.topping = topping;
        }
        if(sugar.equals("Tak"))
        {
            this.price += 0.5;
            this.sugar = sugar;
        }
        if(cream.equals("Tak"))
        {
            this.price += 2.5;
            this.cream = cream;
        }
        if(!fruit.equals("Brak"))
        {
            this.price += 2.5;
            this.fruit = fruit;
        }
    }
}
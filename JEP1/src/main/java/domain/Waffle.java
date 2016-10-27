package domain;

import service.WaffleTypes;

public class Waffle
{
    private String type = "Suchy";
    private double price = 3.5;

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
    public void setPrice(boolean topping, boolean sugar, boolean cream, boolean fruit)
    {
        if(topping) this.price += 1.5;
        if(sugar) this.price += 0.5;
        if(cream) this.price += 2.5;
        if(fruit) this.price += 2.5;

        setType();
    }
}
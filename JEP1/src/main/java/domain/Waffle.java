package domain;

public class Waffle
{
    private String type = "Żaden";
    private double price = 0;

    public Waffle()
    {
        super();
    }

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

    public void setType(String type)
    {
        this.type = type;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
}
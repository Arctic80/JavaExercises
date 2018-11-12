package Model;


public class Flower extends Item
{
    private String color;

    public Flower(double price, String color) throws Exception
    {
        super(price);
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    @Override
    public String toString()
    {
        return "ID: " + getId() + "   PRICE: " + getPrice() + "  COLOR: " + getColor() + "\n";
    }
}
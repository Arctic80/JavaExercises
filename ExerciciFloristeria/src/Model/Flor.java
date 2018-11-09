package Model;


public class Flor extends Item
{
    private String color;

    public Flor(double precio, String color) throws Exception
    {
        super(precio);
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }
}
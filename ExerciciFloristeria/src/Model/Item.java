package Model;


public abstract class Item
{
    private static int LAST_ID = 1;
    protected int id;
    double price;

    public Item(double price) throws Exception
    {
        if (price <= 0) throw new Exception();
        this.price = price;
        id = LAST_ID;
        LAST_ID++;
    }

    public int getId() {
        return id;
    }

    public double getPrice()
    {
        return price;
    }
}
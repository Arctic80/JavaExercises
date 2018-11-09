package Model;


public abstract class Item
{
    private static int LAST_ID = 1;
    protected int id;
    double precio;

    public Item(double precio) throws Exception
    {
        if (precio <= 0) throw new Exception();
        this.precio = precio;
        id = LAST_ID;
        LAST_ID++;
    }

    public int getId() {
        return id;
    }

    public double getPrecio()
    {
        return precio;
    }
}
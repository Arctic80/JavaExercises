package Model;


public class Tree extends Item
{
    private int height;

    public Tree(double price, int height) throws Exception
    {
        super(price);
        this.height = height;
    }

    public int getHeight()
    {
        return height;
    }

    @Override
    public String toString() {

        return "ID: " + getId() +"   PRICE: "+ getPrice() +"  HEIGHT: " + getHeight() + "\n";
    }
}
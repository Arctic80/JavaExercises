package Model;


public class Decoration extends Item
{
    private MaterialType materialType;

    public Decoration(double price, MaterialType materialType) throws Exception
    {
        super(price);
        this.materialType = materialType;
    }

    public MaterialType getMaterialType()
    {
        return materialType;
    }

    @Override
    public String toString()
    {
        return "ID: " + getId() + "   PRICE: " + getPrice() + "  MATERIAL: " + getMaterialType() + "\n";
    }
}
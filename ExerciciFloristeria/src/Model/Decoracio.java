package Model;


public class Decoracio extends Item
{
    private TipoMaterial tipoMaterial;

    public Decoracio(double precio, TipoMaterial tipoMaterial) throws Exception
    {
        super(precio);
        this.tipoMaterial = tipoMaterial;
    }

    public TipoMaterial getTipoMaterial()
    {
        return tipoMaterial;
    }
}
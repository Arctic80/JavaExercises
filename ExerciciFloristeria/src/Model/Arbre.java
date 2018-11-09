package Model;


public class Arbre extends Item
{
    private int altura;

    public Arbre(double precio, int altura) throws Exception
    {
        super(precio);
        this.altura = altura;
    }

    public int getAltura()
    {
        return altura;
    }
}
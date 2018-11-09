import Model.Floristeria;
import Model.TipoMaterial;


public class Main
{
    public static void main(String[] args)
    {
        Floristeria floristeria = new Floristeria();
        try
        {
            floristeria.afegirArbre(66,3);
            floristeria.afegirArbre(45.67, 1);
            floristeria.afegirArbre(43.66, 1);

            floristeria.afegirFlor(11.00, "Blanco");
            floristeria.afegirFlor(17.00, "Rojo");

            floristeria.afegirDecoracio(34.99, TipoMaterial.MADERA);
            floristeria.afegirDecoracio(19.99, TipoMaterial.PLASTICO);

            floristeria.printStock();
        }
        catch (Exception e)
        {
            System.out.println("Error: Algún precio es negativo o cero");
        }

    }
}

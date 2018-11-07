import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        try
        {
            Coet coet1 = new Coet("32WESSDS", Arrays.asList(10,50,50,50));
            coet1.acelerar(2);
            coet1.acelerar();

            System.out.println(coet1.getIdCoet() + " : " + coet1.getNumPropulsors() + " : "
                    + coet1.getPotenciasMaximas() + " : " + coet1.potenciaActual());
        }
        catch (InitCoetException e)
        {
            System.out.println(e);
        }
    }
}
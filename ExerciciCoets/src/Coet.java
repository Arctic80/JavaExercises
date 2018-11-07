import java.util.ArrayList;
import java.util.List;


public class Coet
{
    private final String idCoet;
    private final int numPropulsors;
    private List<Propulsor> propulsores = new ArrayList<>();

    public Coet(String idCoet, List<Integer> potencias) throws InitCoetException
    {
        if (idCoet.length() != 8 || potencias == null || potencias.size() < 1)  { throw new InitCoetException();}

        this.idCoet = idCoet;
        this.numPropulsors = potencias.size();

        for (Integer i : potencias)
        {
            Propulsor p = new Propulsor(i);
            propulsores.add(p);
        }

        System.out.println(propulsores);
    }

    public void acelerar() {for (Propulsor p : propulsores) p.acelerar();}

    public void acelerar(int n) {for (int i = 0; i < n; i++) acelerar();}

    public void frenar() {for (Propulsor p : propulsores) p.frenar();}

    public void frenar(int n)  {for (int i = 0; i < n; i++) frenar();}

    public Integer potenciaActual()
    {
        int temp = 0;
        for (Propulsor p : propulsores) temp = temp + p.getPotenciaActual();

        return temp;
    }

    public String getIdCoet() {
        return idCoet;
    }

    public int getNumPropulsors() {
        return numPropulsors;
    }

    public List<Integer> getPotenciasMaximas() {

        List<Integer> listaPotencias = new ArrayList<>();
        for (Propulsor p : propulsores) listaPotencias.add(p.getPotenciaMaxima());

        return listaPotencias;
    }
}
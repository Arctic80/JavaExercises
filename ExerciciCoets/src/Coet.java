import java.util.ArrayList;
import java.util.List;

public class Coet
{
    private final String idCoet;
    private List<Integer> potencias;
    private final int numPropulsors;

    public Coet(String idCoet, List<Integer> potencias) throws InitCoetException
    {
        if (idCoet.length() != 8 || potencias.size() < 1)  { throw new InitCoetException();}
        this.idCoet = idCoet;
        this.potencias = new ArrayList<>(potencias);
        this.numPropulsors = potencias.size();
    }

    public Coet(String idCoet, int numPropulsors) throws InitCoetException
    {
        if (idCoet.length() != 8 || numPropulsors <= 0)  { throw new InitCoetException();}
        this.idCoet = idCoet;
        this.potencias = new ArrayList<>(numPropulsors);
        this.numPropulsors = numPropulsors;

        for (int i = 0; i < numPropulsors; i++) potencias.add(Integer.valueOf(0));
    }

    public void accelerar(int indexProp)
    {
        if (potencias.size() > indexProp)
        {
            Integer potencia = potencias.get(indexProp);
            potencias.set(indexProp, potencia + 10);
        }
    }

    public void accelerarAllEngines()
    {
        for (int i = 0; i < potencias.size(); i++) accelerar(i);
    }

    public void accelerateNtimes(int n)
    {
        for (int i = 0; i < n; i++) accelerarAllEngines();
    }

    public void frenar(int indexProp)
    {
        if (potencias.size() > indexProp)
        {
            Integer potencia = potencias.get(indexProp);
            if (potencia >= 10) potencias.set(indexProp, potencia - 10);
        }
    }

    public void frenarAllEngines()
    {
        for (int i = 0; i < potencias.size(); i++) frenar(i);
    }

    public void brakeNtimes(int n)
    {
        for (int i = 0; i < n; i++) frenarAllEngines();
    }

    public Integer velocidadActual()
    {
        Integer velocidad = new Integer(0);

        for (Integer potencia: potencias)
        {
            velocidad = velocidad + potencia;
        }
        return velocidad;
    }

    public String velocidadActualText()
    {
        return "Velocidad actual: " + velocidadActual();
    }

    public String getIdCoet() {
        return idCoet;
    }

    public String idCoetText()
    {
        return "IdCoet: " + getIdCoet();
    }

    public List<Integer> getPotencias() {
        return potencias;
    }

    public String getPotenciasText()
    {
        return "Potència propulsors: " + getPotencias().toString();
    }

    public int getNumPropulsors()
    {
        return numPropulsors;
    }

    public String numPropulsorsText()
    {
        return "Num propulsors: " + Integer.valueOf(getNumPropulsors());
    }
}

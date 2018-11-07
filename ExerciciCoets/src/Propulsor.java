public class Propulsor
{
    private final int potenciaMaxima;
    private int potenciaActual;


    public Propulsor(int potenciaMaxima)
    {
        this.potenciaMaxima = potenciaMaxima;
        this.potenciaActual = 0;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public int getPotenciaActual() {
        return potenciaActual;
    }

    public void acelerar()
    {
        int potencia = potenciaActual + 10;
        if (potencia <= potenciaMaxima) potenciaActual = potencia;
    }

    public void frenar()
    {
        int potencia = potenciaActual - 10;
        if (potencia >= 0) potenciaActual = potencia;
        else potenciaActual = 0;
    }
}
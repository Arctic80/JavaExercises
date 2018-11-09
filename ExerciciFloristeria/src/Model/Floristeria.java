package Model;

import java.util.ArrayList;
import java.util.List;


public class Floristeria
{
    private List<Arbre> arbres = new ArrayList<>();
    private List<Flor> flors = new ArrayList<>();
    private List<Decoracio> decoracions = new ArrayList<>();

    public Floristeria(){}

    public void afegirArbre(double precio, int altura) throws Exception
    {
        arbres.add(new Arbre(precio, altura));
    }

    public void afegirFlor(double precio, String color) throws Exception
    {
        flors.add(new Flor(precio, color));
    }

    public void afegirDecoracio(double precio, TipoMaterial tipoMaterial) throws Exception
    {
        decoracions.add(new Decoracio(precio, tipoMaterial));
    }

    public void printStock()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("STOCK: \n\n");

        sb.append("ARBRES: \n");
        for (Arbre a : arbres) sb.append("ID: " ).append(a.getId()).append("   PREU: ").append(a.getPrecio()).append("  ALÇADA: ").append(a.getAltura()).append("\n");
        sb.append("\n");

        sb.append("FLORS: \n");
        for (Flor f : flors) sb.append("ID: " ).append(f.getId()).append("   PREU: ").append(f.getPrecio()).append("  COLOR: ").append(f.getColor()).append("\n");
        sb.append("\n");

        sb.append("FLORS: \n");
        for (Decoracio d : decoracions) sb.append("ID: " ).append(d.getId()).append("   PREU: ").append(d.getPrecio()).append("  MATERIAL: ").append(d.getTipoMaterial()).append("\n");

        System.out.println(sb.toString());
    }
}
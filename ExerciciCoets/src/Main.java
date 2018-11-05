import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        try{
            //FASE 1
            Coet coet1 = new Coet("LDSFJA32", 3);
            Coet coet2 = new Coet("LDSFJA32", 6);
            System.out.println(coet1.idCoetText() + " " + coet1.numPropulsorsText());
            System.out.println(coet2.idCoetText() + " " + coet2.numPropulsorsText());
            System.out.println();

            //FASE 2
            Coet coet3 = new Coet("32WESSDS", Arrays.asList(10,30,80));
            Coet coet4 = new Coet("LDSFJA32", Arrays.asList(30,40,50,50,30,10));

            System.out.println(coet3.idCoetText() + " " + coet3.numPropulsorsText() + " " + coet3.getPotenciasText());
            System.out.println(coet4.idCoetText() + " " + coet4.numPropulsorsText() + " " + coet4.getPotenciasText());
            System.out.println();

            //FASE 3
            Coet coet5 = new Coet("LDSFJA32", 3);
            Coet coet6 = new Coet("LDSFJA32", 6);

            System.out.println(coet5.idCoetText() + " " + coet5.numPropulsorsText() + " " + coet5.getPotenciasText());
            System.out.println(coet6.idCoetText() + " " + coet6.numPropulsorsText() + " " + coet6.getPotenciasText());
            System.out.println();

            //1
            Coet coet7 = new Coet("32WESSDS", Arrays.asList(10,30,80));
            Coet coet8 = new Coet("LDSFJA32", Arrays.asList(30,40,50,50,30,10));

            //2
            System.out.println(coet7.idCoetText() + " " + coet7.numPropulsorsText() + " " + coet7.getPotenciasText());
            System.out.println(coet8.idCoetText() + " " + coet8.numPropulsorsText() + " " + coet8.getPotenciasText());
            System.out.println();

            //3
            System.out.println(coet7.getIdCoet() + " " + coet7.velocidadActualText());
            System.out.println(coet8.getIdCoet() + " " + coet8.velocidadActualText());
            System.out.println();

            //4
            coet7.accelerateNtimes(3);
            coet8.accelerateNtimes(3);

            //5
            System.out.println(coet7.getIdCoet() + " Accelerat 3 cops, " + coet7.velocidadActualText());
            System.out.println(coet8.getIdCoet() + " Accelerat 3 cops, " + coet8.velocidadActualText());
            System.out.println();

            //6
            coet7.brakeNtimes(5);
            coet8.accelerateNtimes(7);

            //7
            System.out.println(coet7.getIdCoet() + " Frenat 5 times, " + coet7.velocidadActualText());
            System.out.println(coet8.getIdCoet() + " Accelerated 7 times, " + coet8.velocidadActualText());
            System.out.println();

            //8
            coet7.accelerateNtimes(15);
            coet8.accelerateNtimes(15);

            //9
            System.out.println(coet7.getIdCoet() + " Accelerat 15 cops, " + coet7.velocidadActualText());
            System.out.println(coet8.getIdCoet() + " Accelerat 15 cops, " + coet8.velocidadActualText());
            System.out.println();
        }
        catch (InitCoetException e)
        {
            System.out.println(e);
        }
    }
}
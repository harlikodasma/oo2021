import java.lang.Math;

public class Kolmnurk implements Kujundid {
    public double pindala(double[] arvud) {
        double pindala;
        double esimene = arvud[0];
        double teine = arvud[1];
        pindala = (esimene * teine) / 2;
        return pindala;
    }
    public double ymbermoot(double[] arvud) {
        double ymbermoot;
        double esimene = arvud[0];
        double teine = arvud[2];
        double kolmas = arvud[3];
        ymbermoot = esimene + teine + kolmas;
        return ymbermoot;
    }
}
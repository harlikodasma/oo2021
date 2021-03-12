import java.lang.Math;

public class Ruut implements Kujundid {
    public double pindala(double[] arvud) {
        double pindala;
        double esimene = arvud[0];
        pindala = Math.pow(esimene, 2);
        return pindala;
    }
    public double ymbermoot(double[] arvud) {
        double ymbermoot;
        double esimene = arvud[0];
        ymbermoot = 4 * esimene;
        return ymbermoot;
    }
}
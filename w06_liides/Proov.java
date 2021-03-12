public class Proov {
    public static void main(String[] arg) {
        Kolmnurk kolmnurk = new Kolmnurk();
        Ruut ruut = new Ruut();

        double[] kolmnurgaArvud = {5, 6, 8, 11};
        double[] ruuduArvud = {11};

        double kolmnurgaPindala = kolmnurk.pindala(kolmnurgaArvud);
        double kolmnurgaYmbermoot = kolmnurk.ymbermoot(kolmnurgaArvud);
        System.out.println("Kolmnurk, mille alus 5 ja kõrgus 6, pindala on " + kolmnurgaPindala);
        System.out.println("Kolmnurk, mille küljepikkused on 5, 8 ja 11, ümbermõõt on " + kolmnurgaYmbermoot);

        System.out.println("----------------------------");

        double ruuduPindala = ruut.pindala(ruuduArvud);
        double ruuduYmbermoot = ruut.ymbermoot(ruuduArvud);
        System.out.println("Ruut, mille küljepikkus on 11, pindala on " + ruuduPindala);
        System.out.println("Ruut, mille küljepikkus on 11, ümbermõõt on " + ruuduYmbermoot);
    }
}
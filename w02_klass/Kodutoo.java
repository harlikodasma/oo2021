public class Kodutoo {
    public static void main(String[] arg) {
        Planimeetria planimeetria = new Planimeetria();
        Planimeetria.Pindala pindala = planimeetria.new Pindala();
        Planimeetria.Ymbermoot ymbermoot = planimeetria.new Ymbermoot();

        System.out.println("Ringi pindala: " + pindala.Ring(6));
        System.out.println("Ruudu pindala: " + pindala.Ruut(13));
        System.out.println("Kolmnurga pindala: " + pindala.Kolmnurk(6, 8));
        System.out.println("Ristküliku pindala: " + pindala.Ristkylik(2, 3));
        System.out.println("Ringi ümbermõõt: " + ymbermoot.Ring(4));
        System.out.println("Ruudu ümbermõõt: " + ymbermoot.Ruut(9));
        System.out.println("Kolmnurga ümbermõõt: " + ymbermoot.Kolmnurk(5, 6, 2));
        System.out.println("Ristküliku ümbermõõt: " + ymbermoot.Ristkylik(15, 4));

        /* Pindala ring = new Pindala();
        Pindala ristkylik = new Pindala();
        System.out.println(ring.Ring(5));
        System.out.println(ristkylik.Ristkylik(5, 4)); */
    }
}
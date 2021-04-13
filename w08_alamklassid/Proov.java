public class Proov {
    public static void main(String[] arg) {
        System.out.println("-------------------");

        Kass k1 = new Kass();
        System.out.println("KASS");
        k1.normKalorid();
        k1.paljuKaloreid();
        k1.mjau();
        k1.sooToitu(195);
        System.out.println("Kassile anti 195 kalori jagu toitu.");
        k1.kasToidetudKyllalt(k1.normKalorid);
        k1.paljuKaloreid();
        k1.mjau();
        System.out.println("-------------------");

        Koer k2 = new Koer();
        System.out.println("KOER");
        k2.normKalorid();
        k2.paljuKaloreid();
        k2.auh();
        k2.sooToitu(200);
        System.out.println("Koerale anti 200 kalori jagu toitu.");
        k2.kasToidetudKyllalt(k2.normKalorid);
        k2.auh();
        k2.paljuKaloreid();
        k2.sooToitu(200);
        System.out.println("Koerale anti 200 kalori jagu toitu.");
        k2.kasToidetudKyllalt(k2.normKalorid);
        k2.paljuKaloreid();
        System.out.println("-------------------");
    }
}
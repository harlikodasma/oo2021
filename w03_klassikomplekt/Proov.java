public class Proov {
    public static void main(String[] arg) {
        System.out.println("----------------------------------------------");
        Pank p1 = new Pank("Kodupank", 31);
        Pank p2 = new Pank("Välispank", 706);
        System.out.println("Kliente alguses pangas '" + p1.panganimi + "': " + p1.KlienteHetkel());
        p1.KliendiArvuMuutus(53);
        System.out.println("Kliente pärast muutust pangas '" + p1.panganimi + "': " + p1.KlienteHetkel());
        System.out.println("Kliente alguses pangas '" + p2.panganimi + "': " + p2.KlienteHetkel());
        p2.KliendiArvuMuutus(-241);
        System.out.println("Kliente pärast muutust pangas '" + p2.panganimi + "': " + p2.KlienteHetkel());

        System.out.println("----------------------------------------------");
        p1.UusKonto("Mari Maasikas", 579002857, 51.40);
        p2.UusKonto("Mati Mutt", 213413561, 3258.02);
        System.out.println(p1.toString());
        System.out.println("Lisame natuke raha...");
        p1.konto.KontoJaagiMuutus(28.40, 0);
        System.out.println(p1.toString());
        System.out.println(" ");
        System.out.println(p2.toString());
        System.out.println("Eemaldame natuke raha...");
        p2.konto.KontoJaagiMuutus(14.15, 1);
        System.out.println(p2.toString());
        System.out.println("----------------------------------------------");
    }
}
public class Proov4 {
    public static void main(String[] arg) {
        Puhver<Integer, Integer> p1 = new Puhver<Integer, Integer>(new RuuduArvutaja());
        System.out.println(p1.arvuta(3));
        System.out.println(p1.arvuta(5));
        System.out.println(p1.arvuta(3));
        System.out.println(p1.hoidla);

        Puhver<String, String> p2 = new Puhver<String, String>(new Duubeldaja());
        System.out.println(p2.arvuta("tere"));
        System.out.println(p2.arvuta("tore"));
        System.out.println(p2.arvuta("tere"));
        System.out.println(p2.hoidla);

        Puhver<String, String> p3 = new Puhver<String, String>(new EsimenePoolitaja());
        System.out.println(p3.arvuta("tere"));
        System.out.println(p3.arvuta("vägev"));
        System.out.println(p3.arvuta("tere"));
        System.out.println(p3.arvuta("vägev"));
        System.out.println(p3.hoidla);

        Puhver<String, String> p4 = new Puhver<String, String>(new TeinePoolitaja());
        System.out.println(p4.arvuta("tere"));
        System.out.println(p4.arvuta("vägev"));
        System.out.println(p4.arvuta("tere"));
        System.out.println(p4.arvuta("vägev"));
        System.out.println(p4.hoidla);
    }
}
public class Konto {
    double jaak;
    String kasutajanimi;
    String panganimi;
    int kontonumber;
    Ulekanne ylekanne;

    public Konto(String kliendinimi, int number, double algsumma, String panknimi) {
        jaak = algsumma;
        kasutajanimi = kliendinimi;
        panganimi = panknimi;
        kontonumber = number;
    }
    public void KontoJaagiMuutus(double arv, int tehing) {
        ylekanne = new Ulekanne(jaak, arv, tehing);
        jaak = ylekanne.tagastus();
    }
    public String toString() {
        return "Kliendil " + kasutajanimi + " pangas '" + panganimi + "' konto numbriga " + kontonumber + ", kontojääk " + jaak + " eurot.";
    }
}
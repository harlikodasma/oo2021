public class Pank {
    String panganimi;
    int klientideArv;
    Konto konto;
    public Pank(String nimi, int kliendid) {
        panganimi = nimi;
        klientideArv = kliendid;
    }
    public void KliendiArvuMuutus(int arv) {
        klientideArv += arv;
    }
    public int KlienteHetkel() {
        return klientideArv;
    }
    public void UusKonto(String nimi, int number, double summa) {
        konto = new Konto(nimi, number, summa, panganimi);
    }
    public String toString() {
        return konto.toString();
    }
}
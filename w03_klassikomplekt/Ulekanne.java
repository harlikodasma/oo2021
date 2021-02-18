public class Ulekanne {
    double summa;
    public Ulekanne(double jaak, double arv, int tehing) {
        if(tehing == 0) {
            summa = jaak + arv;
        } else {
            summa = jaak - arv;
        }
    }
    public double tagastus() {
        return summa;
    }
}
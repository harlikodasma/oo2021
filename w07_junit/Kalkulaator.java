public class Kalkulaator implements KalkulaatoriLiides {
    String vaartus;
    String esimenePool;
    String tehe;
    boolean yleKirjutada;
    public void vajutus(String nupp) {
        if(nupp.equals("C")) {
            esimenePool = "0";
            tehe = "0";
            vaartus = "0";
        } else if(nupp.equals("+") || nupp.equals("**")) {
            esimenePool = vaartus;
            tehe = nupp;
            yleKirjutada = true;
        } else if(nupp.equals("sin")) {
            vaartus = String.valueOf(Math.sin(Integer.parseInt(vaartus)));
        } else if(nupp.equals("=")) {
            if(tehe.equals("+")) {
                vaartus = String.valueOf(Integer.parseInt(esimenePool) + Integer.parseInt(vaartus));
            }
            if(tehe.equals("**")) {
                vaartus = String.valueOf((int)(Math.pow(Integer.parseInt(esimenePool), Integer.parseInt(vaartus))));
            }
        } else if(vaartus.equals("0")) {
            vaartus = nupp;
        } else {
            if(yleKirjutada == true) {
                vaartus = nupp;
                yleKirjutada = false;
            } else {
                vaartus += nupp;
            }
        }
    }

    public String kuvatav() {
        return vaartus;
    }
}

import java.util.*;
import java.io.*;

public class Kaalutudkeskmine {
    HashMap<String, String> hinneArvuks = new HashMap<String, String>();
    public HashMap <String, String> hindedSisse() {
        hinneArvuks.put("A", "5");
        hinneArvuks.put("B", "4");
        hinneArvuks.put("C", "3");
        hinneArvuks.put("D", "2");
        hinneArvuks.put("E", "1");
        hinneArvuks.put("F", "0");
        return hinneArvuks;
    }

    public double AP2(double punkt1, String hinne1, double punkt2, String hinne2) {
        hindedSisse();
        String saadudhinne1 = hinneArvuks.get(hinne1);
        String saadudhinne2 = hinneArvuks.get(hinne2);
        int hinne1numbrina = Integer.parseInt(saadudhinne1);
        int hinne2numbrina = Integer.parseInt(saadudhinne2);
        double vastus = ((hinne1numbrina * punkt1) + (hinne2numbrina * punkt2)) / (punkt1 + punkt2);
        return vastus;
    }

    public double kogumistKKH(Integer[] punktid, String[] hinded) {
        hindedSisse();
        ArrayList<String> hindedArvuna = new ArrayList<String>();
        for(int i = 0; i < hinded.length; i++) {
            hindedArvuna.add(hinneArvuks.get(hinded[i]));
        }
        double vahetulemus = 0;
        int eapd = 0;
        for(int i = 0; i < punktid.length; i++) {
            int hinne = Integer.parseInt(hindedArvuna.get(i));
            int punkt = punktid[i];
            eapd += punkt;
            vahetulemus += hinne * punkt;
        }
        double vastus = vahetulemus / eapd;
        return vastus;
    }

    public void KKHfaili() throws IOException {
        int i = 0;
        ArrayList<String> hinded = new ArrayList<String>();
        ArrayList<Integer> punktid = new ArrayList<Integer>();
        BufferedReader lugeja = new BufferedReader(new FileReader("sisend.txt"));
        while(lugeja.readLine() != null) {
            i++;
        }
        lugeja.close();

        BufferedReader sisse = new BufferedReader(new FileReader("sisend.txt"));
        for(int a = 0; a < i; a++) {
            String rida[] = sisse.readLine().split(", ");
            punktid.add(Integer.parseInt(rida[1]));
            hinded.add(rida[2]);
        }
        sisse.close();

        //peale toArray-d oleks object tüüpi mis ei sobi kogumistKKH methodile, järgnev sunnib tagasi array tüüpi
        int arv1 = punktid.size();
        int arv2 = hinded.size();
        Integer[] m1 = (Integer[])punktid.toArray(new Integer[arv1]);
        String[] m2 = (String[])hinded.toArray(new String[arv2]);

        double vastus = kogumistKKH(m1, m2);

        PrintWriter pw = new PrintWriter(new FileWriter("valjund.txt"));
        pw.println("Kursuste kaalutud keskmine hinne on " + vastus);
        pw.close();
        System.out.println("Sisendfailis antud ainekursuste kaalutud keskmine hinne on salvestatud faili 'valjund.txt'.");
    }
}
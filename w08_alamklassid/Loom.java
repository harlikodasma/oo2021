public class Loom {
    private int kaloreid = 0;

    public void paljuKaloreid() {
        System.out.println("Täna kaloreid saadud: " + kaloreid);
    }

    public void sooToitu(int kalorid) {
        kaloreid += kalorid;
    }

    public void kasToidetudKyllalt(int norm) {
        if(kaloreid < norm) {
            System.out.println("Ei ole küllalt toidetud");
        } else {
            System.out.println("Küllalt toidetud");
        }
    }
}
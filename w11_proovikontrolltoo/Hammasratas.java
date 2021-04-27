public class Hammasratas {
    int praeguneHammas = 1;
    int mitmesRing;
    int hambad;

    public Hammasratas(int arv) {
        hambad = arv;
    }

    public void edasi() {
        praeguneHammas++;
        if(praeguneHammas == (hambad + 1)) {
            mitmesRing++;
            System.out.println("Hammasrattal sai täis ring number " + mitmesRing);
            praeguneHammas = 1;
        }
    }
}
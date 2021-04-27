public class Pendel {
    double vonkeperiood;
    long vonge;
    public Pendel(double pikkus, Hammasratas ratas) throws InterruptedException {
        vonkeperiood = 2 * Math.PI * Math.sqrt(pikkus / 9.8);
        vonge = (long) vonkeperiood * 1000;
        while(true) {
            System.out.println("Tik");
            Thread.sleep(vonge);
            ratas.edasi();
            System.out.println("Tak");
            Thread.sleep(vonge);
            ratas.edasi();
        }
    }
}
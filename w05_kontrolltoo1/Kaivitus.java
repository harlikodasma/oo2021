public class Kaivitus {
    public static void main(String[] arg) throws Exception {
        Kaalutudkeskmine kaalutudkeskmine = new Kaalutudkeskmine();
        double kahega = kaalutudkeskmine.AP2(6, "A", 3, "C");
        System.out.println("Kahe ainekursuse põhjal KKH: " + kahega);

        Integer[] punktid = {6, 4, 6, 3, 2};
        String[] hinded = {"A", "B", "E", "C", "A"};
        double kogumist = kaalutudkeskmine.kogumistKKH(punktid, hinded);
        System.out.println("Etteantud kogumite põhjal KKH: " + kogumist);

        kaalutudkeskmine.KKHfaili();
    }
}
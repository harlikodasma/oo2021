public class Proov {
    static double[] keskmised = {3, 8, 12, 5, 4, 7, 9, 2};
    public static void main(String[] arg) throws Exception {
        System.out.println("Kolme arvu aritmeetiline keskmine: " + Keskmine.AritKesk(7, 12, 4));
        System.out.println("Massiivi libisevad keskmised:");
        double[] vastus = Keskmine.LibiKesk(keskmised);
        for(int i = 0; i < vastus.length; i++) {
            System.out.println(vastus[i]);
        }
        Keskmine.Joonista(keskmised, vastus);
    }
}

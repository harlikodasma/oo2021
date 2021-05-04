public class Proov1 {
    public static void main(String[] args) {
        Element e1 = new Element(true);
        Element e2 = new Element(true);
        AndOr j1 = new AndOr("and", e1, e2, "esimene");
        System.out.println("Jada '" + j1.elnimi + "' kokkuvõte: " + j1.kysi());

        Element e9 = new Element(true);
        Element e10 = new Element(true);
        Not n1 = new Not(e9);
        Not n2 = new Not(e9);
        AndOr j5 = new AndOr("and", e9, e10, "viies", j1);
        System.out.println("Jada '" + j5.elnimi + "' kokkuvõte: " + j5.kysi());

        Element e3 = new Element(true);
        Element e4 = new Element(false);
        AndOr j2 = new AndOr("and", e3, e4, "teine", j1);
        System.out.println("Jada '" + j2.elnimi + "' kokkuvõte: " + j2.kysi());

        Element e5 = new Element(false);
        Element e6 = new Element(true);
        AndOr j3 = new AndOr("and", e5, e6, "kolmas", j2);
        System.out.println("Jada '" + j3.elnimi + "' kokkuvõte: " + j3.kysi());

        Element e7 = new Element(false);
        Element e8 = new Element(false);
        AndOr j4 = new AndOr("and", e7, e8, "neljas", j3);
        System.out.println("Jada '" + j4.elnimi + "' kokkuvõte: " + j4.kysi());
    }
}
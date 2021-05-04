public class Proov2 {
    public static void main(String[] args) {
        Element a1 = new Element(true);
        Element a2 = new Element(true);
        Element a3 = new Element(true);
        Element a4 = new Element(true);
        Element a5 = new Element(true);
        Element a6 = new Element(true);
        Element a7 = new Element(true);
        Element a8 = new Element(true);
        Element a9 = new Element(true);
        Element a10 = new Element(true);
        Element a11 = new Element(true);

        AndOr o1 = new AndOr("or", a2, a6, "esimeneOr", a1);
        AndOr o2 = new AndOr("or", a3, a5, "teineOr", a2);
        AndOr o3 = new AndOr("and", a3, a4, "esimeneAnd", a3);
        AndOr o4 = new AndOr("or", a7, a11, "kolmasOr", a6);
        AndOr o5 = new AndOr("and", a7, a8, "teineAnd", a7);
        AndOr o6 = new AndOr("or", a9, a10, "neljasOr", a8);

        /*AndOr o1 = new AndOr("or", a2, a6, "esimeneOr");
        AndOr o2 = new AndOr("or", a3, a5, "teineOr", a2);
        AndOr o3 = new AndOr("and", a3, a4, "esimeneAnd", a3);
        AndOr o4 = new AndOr("or", a7, a11, "kolmasOr", a6);
        AndOr o5 = new AndOr("and", a7, a8, "teineAnd", a7);
        AndOr o6 = new AndOr("or", a9, a10, "neljasOr", o5);*/

        System.out.println(o6.elnimi + " kokkuvõte: " + o6.kysi()); //true
        new Not(a8);
        System.out.println(o6.elnimi + " kokkuvõte: " + o6.kysi()); //false
        new Not(a8);
        System.out.println(o6.elnimi + " kokkuvõte: " + o6.kysi()); //true
        new Not(a7);
        System.out.println(o5.elnimi + " kokkuvõte: " + o5.kysi()); //false
        new Not(a7);
        System.out.println(o5.elnimi + " kokkuvõte: " + o5.kysi()); //true
        System.out.println(o3.elnimi + " kokkuvõte: " + o3.kysi()); //true
        new Not(a3);
        System.out.println(o3.elnimi + " kokkuvõte: " + o3.kysi()); //false
        new Not(a3);
        System.out.println(o3.elnimi + " kokkuvõte: " + o3.kysi()); //true
    }
}
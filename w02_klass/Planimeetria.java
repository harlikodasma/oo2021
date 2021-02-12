import java.lang.Math;

public class Planimeetria {
    public class Pindala {
        public double Ring(double raadius) {
            double pindala;
            pindala = Math.PI * Math.pow(raadius, 2);
            return pindala;
        }
        public double Ruut(double kylg) {
            double pindala;
            pindala = Math.pow(kylg, 2);
            return pindala;
        }
        public double Kolmnurk(double alus, double korgus) {
            double pindala;
            pindala = (alus * korgus) / 2;
            return pindala;
        }
        public double Ristkylik(double a, double b) {
            double pindala;
            pindala = a * b;
            return pindala;
        }
    }
    public class Ymbermoot {
        public double Ring(double raadius) {
            double pindala;
            pindala = Math.PI * raadius * 2;
            return pindala;
        }
        public double Ruut(double kylg) {
            double pindala;
            pindala = 4 * kylg;
            return pindala;
        }
        public double Kolmnurk(double a, double b, double c) {
            double pindala;
            pindala = a + b + c;
            return pindala;
        }
        public double Ristkylik(double a, double b) {
            double pindala;
            pindala = 2 * (a + b);
            return pindala;
        }
    }
}
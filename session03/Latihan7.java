package session03;

public class Latihan7 {
    // Nilai Desimal
    public static void main(String[] args) {
        double a = .6 + .6 + .6 + .6 + .6 + .6;
        double b = .6 * 6;
        System.out.println("A is " + a);
        System.out.println("B is " + b);

        if (a != b) {
            System.out.println("A is not equal to B.");
        }

        if (Math.abs(a - b) < .001) {
            System.out.println("A is close enough to B.");
        }
    }
}

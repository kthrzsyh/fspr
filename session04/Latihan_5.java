package session04;

public class Latihan_5 {
    public static void main(String[] args) {
        int x1, x2, y1 = 4, y2 = 3;
        boolean hasil;

        x1 = (y1 + y2) * (y1 + y2);
        x2 = (y1 % 4) * y2;
        hasil = x1 >= x2;
        System.out.println("x1 >= x2 " + hasil);
        hasil = x2 >= x1;
        System.out.println("x2 >= x1 " + hasil);
        hasil = (x1 % 4) == ++x2 % 5;
        System.out.println("x1 mod 4 == ++x2 mod 5 " + hasil);
    }

}

public class NewExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int hasil = 0;
        // operator aritmatika
        // System.out.println("x + y = " + (x + y));
        // System.out.println("x - y = " + (x - y));
        // System.out.println("x * y = " + (x * y));
        // System.out.println("y / x = " + (y / x));
        // System.out.println("y & x = " + (y & x));
        // System.out.println("x++ = " + (x++));
        // System.out.println("y++ = " + (y++));

        // // perbedaan x++ dan ++x
        // System.out.println("x++ = " + (x++));
        // System.out.println("++x = " + (++x));

        // operator pembanding
        // System.out.println("x == y " + (x == y));
        // System.out.println("x != y " + (x != y));
        // System.out.println("x > y " + (x > y));
        // System.out.println("x < y " + (x < y));
        // System.out.println("x >= y " + (x >= y));
        // System.out.println("x <= y " + (x <= y));

        // bitwise operator
        hasil = x & y;
        System.out.println("x & y = " + hasil);

        hasil = x | y;
        System.out.println("x | y = " + hasil);

        hasil = x ^ y;
        System.out.println("x ^ y = " + hasil);

        hasil = ~x;
        System.out.println("~x = " + hasil);

        hasil = x << 2;
        System.out.println("x << 2 = " + hasil);

        hasil = x >> 2;
        System.out.println("x >> 2 = " + hasil);

        hasil = x >>> 2;
        System.out.println("x >>> 2 = " + hasil);

    }
}

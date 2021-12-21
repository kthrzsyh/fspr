package session04;

import java.util.Scanner;

public class Latihan_1 {
    public static void main(String[] args) {
        double luas, p1 = 3.14;
        int r;
        Scanner scan = new Scanner(System.in);

        System.out.print("r = ");
        r = scan.nextInt();

        luas = p1 * r * r;

        System.out.println("Luas : " + luas);
        scan.close();
    }
}

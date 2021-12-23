package session07;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pembelian, bayar;
        float diskon = (float) 0.1;

        System.out.print("Masukkan jumlah pembelian : ");
        pembelian = scan.nextInt();

        if (pembelian >= 1000000) {
            bayar = (int) (pembelian * (1 - diskon));
            System.out.println("Diskon = 10%");
            System.out.println("Bayar : " + bayar);
        } else {
            bayar = pembelian;
            System.out.println("Bayar : " + bayar);
        }

        scan.close();
    }

}

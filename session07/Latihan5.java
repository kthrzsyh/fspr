package session07;

import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlah = 0;
        double total_bayar = 0;

        int[] kode = new int[5];
        int[] qty = new int[5];
        int[] harga = new int[5];
        double[] sub_total = new double[5];
        double[] diskon = new double[5];
        String[] nama = new String[5];

        System.out.println("program java jualan sederhana");

        System.out.print("masukkan jumlah beli : ");
        jumlah = scan.nextInt();
        System.out.println(" ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan kode barang ke-" + (i + 1) + ": ");
            kode[i] = scan.nextInt();
            System.out.print("Masukkan qty ke-" + (i + 1) + ": ");
            qty[i] = scan.nextInt();

            switch (kode[i]) {
                case 1:
                    nama[i] = "Mouse Bluetooth 5.0  ";
                    harga[i] = 149999;
                    diskon[i] = 0.1;
                    break;
                case 2:
                    nama[i] = "Headphone Eksternal  ";
                    harga[i] = 246000;
                    diskon[i] = 0.05;
                    break;
                case 3:
                    nama[i] = "Power Bank 10.000 mAh";
                    harga[i] = 136000;
                    diskon[i] = 0;
                    break;
                case 4:
                    nama[i] = "Tripod Kamera        ";
                    harga[i] = 267999;
                    diskon[i] = 0.2;
                    break;
                case 5:
                    nama[i] = "Smart Watch Xiomi    ";
                    harga[i] = 899000;
                    diskon[i] = 0.1;
                    break;
                default:
                    System.out.println("Kode Barang Tidak Tersedia");
            }
        }
        System.out.println("No   Nama Barang             Harga            QTY  Diskon   Sub Total");
        for (int i = 0; i < jumlah; i++) {
            sub_total[i] = ((qty[i] * harga[i]) - (qty[i] * harga[i] * diskon[i]));
            total_bayar += sub_total[i];
            System.out.println(i + 1 + "    " + nama[i] + "     " + harga[i] + "            " + qty[i] + "  "
                    + (int) (diskon[i] * 100) + "%" + "    " + sub_total[i]);
            System.out.println(" ");
            System.out.println("Total Bayar : " + total_bayar);
        }
        scan.close();
    }
}

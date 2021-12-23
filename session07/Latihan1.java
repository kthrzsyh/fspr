package session07;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nilai = new int[3];
        int max, min, sum = 0;
        float mean;
        System.out.println("Menentukan Bilangan Terbesar, Terkecil, dan Rata-Rata");

        System.out.print("Masukkan bilangan pertama (X) : ");
        nilai[0] = scan.nextInt();
        System.out.print("Masukkan bilangan kedua (Y) : ");
        nilai[1] = scan.nextInt();
        System.out.print("Masukkan bilangan ketiga (Z) : ");
        nilai[2] = scan.nextInt();

        max = nilai[0];
        min = nilai[0];

        for (int i = 0; i < 3; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            } else if (nilai[i] < min) {
                min = nilai[i];
            }
            sum += nilai[i];
        }
        mean = sum / 3;

        System.out.println("Hasil");
        System.out.println("rata-ratanya adalah " + mean);
        System.out.println(max + " adalah bilangan terbesar");
        System.out.println(min + " adalah bilangan terkecil");

        scan.close();

    }
}

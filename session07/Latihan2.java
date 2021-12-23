package session07;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] bahasa = new String[2][3];
        for (int i = 0; i < bahasa.length; i++) {
            for (int j = 0; j < bahasa[i].length; j++) {
                System.out.format("siapa yang akan duduk di kelas (%d, %d) : ", i, j);
                bahasa[i][j] = scan.nextLine();
            }
        }

        System.out.println("=========================");
        for (int i = 0; i < bahasa.length; i++) {
            for (int j = 0; j < bahasa[i].length; j++) {
                System.out.format("| %s | \t", bahasa[i][j]);
            }
            System.out.println("");
        }
        System.out.println("==========================");
        scan.close();
    }
}

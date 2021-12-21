package session03;

import java.util.Scanner;

public class BloodPressure {
    public static void main(String[] args) {

        boolean lanjut = true;
        String lanjut2;
        int systolic, diastolic;
        Scanner scan = new Scanner(System.in);

        // int intSystolic = Integer.parseInt(args[0]);
        // int intDiastolic = Integer.parseInt(args[1]);
        while (lanjut) {
            System.out.print("Systolic : ");
            systolic = scan.nextInt();

            System.out.print("Diastolic : ");
            diastolic = scan.nextInt();
            // cek input < 2
            if (String.valueOf(systolic).length() < 2 || String.valueOf(diastolic).length() < 2) {
                System.err.println("format salah");
            } else {
                // cek blood pressure
                if (systolic <= 90 || diastolic <= 60) {
                    System.out.println("Low Blood Pressure");
                } else if (systolic >= 140 || diastolic >= 190) {
                    System.out.println("High Blood Pressure");
                } else if (systolic >= 120 || diastolic >= 80) {
                    System.out.println("pre-High Blood Pressure");
                } else {
                    System.out.println("Ideal Blood Pressure");
                }
            }

            // lanjut program ?
            System.out.print("lanjutkan? (Y/N) : ");
            lanjut2 = scan.next();

            if (lanjut2.equalsIgnoreCase("N")) {
                lanjut = false;
            }
        }
        System.out.println("terima kasih");

        scan.close();

    }
}

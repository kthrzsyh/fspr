import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input Angka-1 : ");
        angka1 = keyboard.nextInt();
        System.out.print("Input Angka-2 : ");
        angka2 = keyboard.nextInt();

        // penjumlahan
        hasil = angka1 + angka2;
        System.out.println("hasil = " + hasil);

        System.out.print("Input Angka-1 : ");
        angka1 = keyboard.nextInt();
        System.out.print("Input Angka-2 : ");
        angka2 = keyboard.nextInt();

        // pengurangan
        hasil = angka1 - angka2;
        System.out.println("hasil = " + hasil);

        System.out.print("Input Angka-1 : ");
        angka1 = keyboard.nextInt();
        System.out.print("Input Angka-2 : ");
        angka2 = keyboard.nextInt();

        // perkalian
        hasil = angka1 * angka2;
        System.out.println("hasil = " + hasil);

        System.out.print("Input Angka-1 : ");
        angka1 = keyboard.nextInt();
        System.out.print("Input Angka-2 : ");
        angka2 = keyboard.nextInt();

        // pembagian
        hasil = angka1 / angka2;
        System.out.println("hasil = " + hasil);

        System.out.print("Input Angka-1 : ");
        angka1 = keyboard.nextInt();
        System.out.print("Input Angka-2 : ");
        angka2 = keyboard.nextInt();

        // sisa bagi
        hasil = angka1 % angka2;
        System.out.println("hasil = " + hasil);

        keyboard.close();
    }
}

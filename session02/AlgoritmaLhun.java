import java.util.Scanner;

public class AlgoritmaLhun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Long cardNumber;
        double angka;
        int jumlah = 0;
        int i = 0;
        String output;

        System.out.println("masukkan no. kartu kredit");
        System.out.print("input : ");
        cardNumber = scan.nextLong();

        while (cardNumber > 0) {
            angka = cardNumber % 10;
            cardNumber = cardNumber / 10;

            if (i % 2 != 0) {
                angka *= 2;
            }
            if (angka > 9) {
                angka = (angka % 10) + 1;
            } else {
                angka *= 1;
            }

            jumlah += angka;
            i++;
        }

        output = jumlah % 10 == 0 ? "Kartu Kredit telah benar" : "Pastikan Input telah benar";
        System.out.println(output);
        scan.close();
    }
}

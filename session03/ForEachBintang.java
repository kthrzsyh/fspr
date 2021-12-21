package session03;

public class ForEachBintang {

    public static void main(String[] args) {
        int tinggi[] = { 1, 2, 3, 4, 5, 6 }, lebar[] = { 1, 2, 3, 4, 5 };

        for (int x : tinggi) {
            for (int y : lebar) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

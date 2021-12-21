package session03;

public class ForEachGanjil {
    public static void main(String[] args) {
        int ganjil[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        for (int x : ganjil) {
            if (x % 2 == 1) {
                System.out.print(x + " ");
            }
        }
    }
}

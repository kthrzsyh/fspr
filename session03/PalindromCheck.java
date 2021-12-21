package session03;

import java.util.Scanner;

public class PalindromCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Word ! = ");
        String kata = "";
        kata += scan.nextLine().toLowerCase();
        String poli = "";

        for (int i = kata.length(); i > 0; i--) {
            String test1 = kata.substring(i - 1, i);
            poli += test1;
        }

        if (kata.equals(poli)) {
            System.out.print("text palindrome");
        } else {
            System.out.print("text bukan palindrome");
        }
        scan.close();
    }

}

package session05;

import java.util.Arrays;

public class ActivityArray {
    public static void main(String[] args) {
        String[] text = { "So", "many", "books", "so", "little", "time" };

        int num = 0;
        // search
        System.out.println(Arrays.toString(text));
        for (int i = 0; i < text.length; i++) {
            if (text[i].equalsIgnoreCase("so")) {
                System.out.println("Found Query at : " + i);
                num++;
            }
        }
        // int search = Arrays.binarySearch(text, "so");
        System.out.println("Found : " + num + " coinciding words");

    }
}

package session05;

import java.util.Arrays;

public class ArraySearching {
    public static void main(String[] args) {
        String[] text = { "love", "is", "the", "air", "is" };
        Arrays.sort(text);
        int search = Arrays.binarySearch(text, "love");
        System.out.println(search);
    }
}

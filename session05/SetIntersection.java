package session05;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SetIntersection {
    public static void main(String[] args) {
        Integer[] numbers1 = new Integer[] { 3, 25, 2, 79, 2 };
        Integer[] numbers2 = new Integer[] { 7, 12, 14, 79 };

        Set set1 = new TreeSet();
        Collections.addAll(set1, numbers1);
        Set set2 = new TreeSet();
        Collections.addAll(set2, numbers2);

        set1.retainAll(set2); // cari irisan dalam 2 set (himpunan)
        System.out.println(set1);
    }
}

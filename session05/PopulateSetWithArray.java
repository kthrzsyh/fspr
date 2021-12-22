package session05;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PopulateSetWithArray {
    public static void main(String[] args) {

        Integer[] myArray = new Integer[] { 3, 25, 2, 79, 2 };
        /*
         * Set mySet = new HashSet(Arrays.asList(myArray));
         * System.out.println(mySet);
         */

        // String[] myArray = new String[] { "3", "25", "2", "79", "2" };
        Set mySet = new HashSet();
        Collections.addAll(mySet, myArray);
        System.out.println(mySet);
    }
}

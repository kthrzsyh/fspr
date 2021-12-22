package session05;

import java.util.ArrayList;
import java.util.List;

public class ListModification {
    public static void main(String[] args) {
        List list = new ArrayList(); // class bisa di tampung ke variable yg bertipe interface nya
        list.add(35);
        list.add(19);
        list.add(11);
        list.add(83);
        list.add(7);
        System.out.println(list);
        int index = list.lastIndexOf(83);
        System.out.println("Before 83 at : " + index);
        list.remove(index - 1);
        System.out.println(list);
        index = list.lastIndexOf(83);
        System.out.println("Before 83 at : " + index);
    }
}

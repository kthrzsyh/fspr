package session08;

import java.sql.Time;
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    static Random random = new Random();

    public void sort(int[] numbers) {
        int time = 0;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            time++;
        }
    }

    private void swap(int[] numbers, int j, int k) {
        int temp = numbers[j];
        numbers[j] = numbers[k];
        numbers[k] = temp;
    }

    public void sortImprovement1(int[] numbers) {
        int time1 = 0;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
            }
            time1++;
        }
    }

    public void sortImprovement2(int[] numbers) {
        int i = 0;
        boolean swapOccured = true;
        while (swapOccured) {
            swapOccured = false;
            i++;
            int time3 = 0;
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                    swapOccured = true;
                }
                time3++;
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }
        int[] numbers1 = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers1[i] = random.nextInt(20);
        }
        int[] numbers2 = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers2[i] = random.nextInt(20);
        }
        bubbleSort.sort(numbers);
        bubbleSort.sortImprovement1(numbers1);
        bubbleSort.sortImprovement2(numbers2);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));
    }
}

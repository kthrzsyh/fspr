package session03;

public class Statistik {
    public static void main(String[] args) {
        double mean, median, modus;
        double sum = 0;
        int[] data = { 2, 2, 4, 4, 4, 6, 7, 8, 9, 10 };

        // mean
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            i++;
        }
        mean = sum / data.length;

        // median
        int tengah = data.length / 2;
        if (data.length % 2 == 1) {
            median = data[tengah];
        } else {
            median = (data[tengah - 1] + data[tengah]) / 2;
        }

        // modus
        int maxValue = 0, maxCount = 0;
        for (int i = 0; i < data.length; i++) {
            int count = 0;
            for (int j = 0; j < data.length; j++) {
                if (data[j] == data[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = data[i];
            }
        }
        modus = maxValue;

        for (int i : data) {
            System.out.print(i + " ");
        }

        System.out.println("\nmean : " + mean);
        System.out.println("median : " + median);
        System.out.println("modus : " + modus);

    }
}

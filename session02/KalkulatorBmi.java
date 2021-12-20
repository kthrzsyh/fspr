import java.util.Scanner;

public class KalkulatorBmi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double height, weight, bmi;
        // berat(kg) / tinggi^2 (m)

        System.out.print("Masukkan berat badan (pound, 1 pound = 0.45359237 kg) : ");
        weight = scan.nextDouble();
        weight = weight * 0.45359237;
        System.out.print("Masukkan tinggi badan (inch, 1 inch = 0.0254 m) : ");
        height = scan.nextDouble();
        height = height * 0.0254;

        bmi = weight / (height * height);
        System.out.println(bmi);
        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }
        scan.close();
    }
}

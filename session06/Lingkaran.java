package session06;

public class Lingkaran extends BangunDatar {

    // jari-jari lingkaran
    float r;

    @Override
    float luas() {
        return 3.14f * r * r;
    }

    @Override
    float keliling() {
        return 3.14f * 2 * r;
    }

    @Override
    public String toString() {
        // overide toString

        return "Lingkaran dengan jari jari : " + r;
    }
}

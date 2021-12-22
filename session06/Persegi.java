package session06;

public class Persegi extends BangunDatar {
    float sisi;

    @Override
    float luas() {
        return sisi * sisi;
    }

    @Override
    float keliling() {
        return 4 * sisi;
    }
}

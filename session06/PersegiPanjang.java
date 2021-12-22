package session06;

public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    @Override
    float luas() {
        return panjang * lebar;
    }

    @Override
    float keliling() {
        return 2 * (panjang + lebar);
    }
}

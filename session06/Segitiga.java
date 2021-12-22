package session06;

import java.lang.Math;

public class Segitiga extends BangunDatar {

    float alas;
    float tinggi;

    @Override
    float luas() {
        return alas * tinggi / 2;
    }

    @Override
    float keliling() {
        float sisi_miring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + sisi_miring;
    }

}

package session06;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();

        // membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        // membuat objek Persegi Panjang dan mengisi nilai properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;

        // membuat objek Segitiga dan mengisi nilai properti
        Segitiga Segitiga = new Segitiga();
        Segitiga.alas = 12;
        Segitiga.tinggi = 8;

        // memanggil method luas dan keliling

        bangunDatar.luas();
        bangunDatar.keliling();

        out.println("luas persegi : " + persegi.luas());
        out.println("keliling persegi : " + persegi.keliling());

        out.println("luas lingkaran : " + lingkaran.luas());
        out.println("keliling lingkaran : " + lingkaran.keliling());

        out.println("luas persegiPanjang : " + persegiPanjang.luas());
        out.println("keliling persegiPanjang : " + persegiPanjang.keliling());

        out.println("luas Segitiga : " + Segitiga.luas());
        out.println("keliling Segitiga : " + Segitiga.keliling());

        out.println("object lingkaran : " + lingkaran); // setiap inheritance memiliki hash yg akan di overide
    }
}

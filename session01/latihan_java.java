import java.util.LinkedList;

//string memakan banyak stack, stringBuilder lebih irit
// data boleh duplicate pake list, tidak boleh duplicate pake set
public class latihan_java {
    public static void main(String[] args) {
        LinkedList<String> buah = new LinkedList<>();

        buah.add("jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");
        buah.addFirst("Paling atas");
        buah.addLast("Paling bawah");

        buah.set(2, "di ubah");
        buah.set(5, "di ubah");

        System.out.println("Nama Buah : " + buah);
        System.out.println("jumlah buah : " + buah.size());
        System.out.println("Data teratas : " + buah.getFirst());
        System.out.println("Data terbawah : " + buah.getLast());
        System.out.println("Data NoIndex 1 : " + buah.get(1));
        System.out.println("Data NoIndex 2 : " + buah.get(2));
        buah.removeFirst();
        buah.removeLast();
        buah.remove(1);
        System.out.println(buah);

        LinkedList<String> barang = new LinkedList<>();

        barang.add("Laptop");
        barang.add("Komputer");
        barang.add("Radio");

        if (barang.isEmpty()) {
            System.out.println("data kosong");
        } else {
            System.out.println("data penuh");
        }

        if (barang.contains("Komputer")) {
            System.out.println("barang ditemukan");
        } else {
            System.out.println("barang tidak ditemukan");
        }
    }
}

package session03;

public class Latihan16 {
    public static void main(String[] args) {
        if (args.length > 0) { // cek apakah ada isinya atau tidak
            int intValue = Integer.parseInt(args[0]); // primitif int, wrapper Integer (object)
            System.out.println(intValue);
        }
        if (args.length > 1) {
            Double doubleValue = Double.parseDouble(args[1]);
            System.out.println(doubleValue);
        }

    }
}

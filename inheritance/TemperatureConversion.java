package inheritance;

class Temperature {
    public double t = 25;

    public double getCelsius() {
        return t;
    }

    final public double getFahrenheit() {
        return t * 9 / 5 + 32;
    }
}

public class TemperatureConversion {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        System.out.println(temp.getCelsius());
        System.out.println(temp.getFahrenheit());
    }
}

package itf;

interface Computer {
    public String getDeviceType();

    public String getSpeed();
}

class Tablet implements Computer {
    public String getDeviceType() {
        return "it is a tablet";
    }

    public String getSpeed() {
        return "1GHZ";
    }
}

public class ComputerExample {
    public static void main(String[] args) {
        Tablet myTab = new Tablet();
        System.out.println(myTab.getDeviceType());
        System.out.println(myTab.getSpeed());
    }
}

package inheritance;

class Computer {
    private double cpuSpeed;

    Computer() {
        cpuSpeed = 0;
    }

    void setCpuSpeed(double _cpuSpeed) {
        cpuSpeed = _cpuSpeed;
    }

    double getCpuSpeed() {
        return cpuSpeed;
    }

    public static void whatIsIt() {
        // static tidak bisa di overide child manapun
        // bisa juga menggunakan keyword final
        System.out.println("it is a PC");
    }
}

class Tablet extends Computer {
    private double screenSize;

    void setScreenSize(double _screenSize) {
        screenSize = _screenSize;
    }

    double getScreenSize() {
        return screenSize;
    }

    public static void whatIsIt() {
        System.out.println(" it is a tablet");
    }
}

public class Contoh1 {
    public static void main(String[] args) {
        Computer myTab = new Tablet();
        myTab.setCpuSpeed(2.5);
        // child menjadi prioritas daripada parent (JVM yg menentukan)
        // myTab.setScreenSize(10);

        System.out.println("cpu speed : " + myTab.getCpuSpeed());
        // System.out.println("screen size : " + myTab.getScreenSize());
        Tablet.whatIsIt();
    }
}

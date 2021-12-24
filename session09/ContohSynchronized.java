package session09;

public class ContohSynchronized {
    public static void main(String[] args) {
        Counter counterA = new Counter();
        Counter counterB = new Counter();
        Thread threadA = new CounterThread(counterA);
        Thread threadB = new CounterThread(counterB);
        // threadA.setPriority(Thread.MAX_PRIORITY);
        // threadB.setPriority(Thread.MIN_PRIORITY);
        threadB.start();

        threadA.start();

    }
}

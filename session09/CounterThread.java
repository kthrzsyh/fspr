package session09;

public class CounterThread extends Thread {
    protected Counter counter = null;

    public CounterThread(Counter counter) {
        this.counter = counter;

    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.add(i);
            System.out.println("Thread " + Thread.currentThread().getName() + " count:" + counter.count);
        }
    }
}

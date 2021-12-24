package session09;

class MyThread implements Runnable {
    public void run() {
        System.out.println(
                Thread.currentThread().getName() + ": Thread " + Thread.currentThread().getName() + " running");
        System.out.println(Thread.currentThread().getName() + ": ID " + Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName() + ": Priority " + Thread.currentThread().getPriority());
    }
}

public class MyOwnThread {
    public static void main(String[] args) {
        Thread threadA = new Thread(new MyThread());
        threadA.setName("A");
        threadA.setPriority(Thread.MIN_PRIORITY);
        Thread threadB = new Thread(new MyThread());
        threadB.setName("B");
        threadB.setPriority(Thread.MAX_PRIORITY);

        threadA.start();
        threadB.start();
    }

    @Override
    public String toString() {
        return "MyOwnThread []";
    }

}

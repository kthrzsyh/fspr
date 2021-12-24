package session09;

class MyOwnThread1 implements Runnable {
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " : Thread " + name + " running");
        for (int i = 0; i < 3; i++) {
            System.out.println(name + ": count: " + i);
        }
    }

    public static class ThreadJoinExample {
        public static void main(String[] args) throws InterruptedException {
            Thread threadA = new Thread(new MyOwnThread1());
            threadA.setName("A");
            Thread threadB = new Thread(new MyOwnThread1());
            threadB.setName("B");

            threadA.start();
            threadA.join();
            threadB.start();
            threadB.join();

            System.out.println("this is the end");
        }
    }
}
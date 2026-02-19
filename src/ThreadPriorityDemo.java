class PriorityThread extends Thread {

    PriorityThread(String name) {
        super(name);
    }

    public void run() {
        // No printing here
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) throws InterruptedException {

        PriorityThread t1 = new PriorityThread("Thread 1");
        PriorityThread t2 = new PriorityThread("Thread 2");
        PriorityThread t3 = new PriorityThread("Thread 3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t1.join();   // Wait until t1 finishes

        t2.start();
        t2.join();   // Wait until t2 finishes

        t3.start();
        t3.join();   // Wait until t3 finishes

        // Print in required order
        System.out.println("Thread 1 Priority: " + t1.getPriority());
        System.out.println("Thread 2 Priority: " + t2.getPriority());
        System.out.println("Thread 3 Priority: " + t3.getPriority());

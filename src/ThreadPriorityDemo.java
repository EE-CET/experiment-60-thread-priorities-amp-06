class PriorityThread extends Thread {

    PriorityThread(String name) {
        super(name);
    }

    public void run() {
        // No task needed
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

        // Start threads
        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

        // Print in required order
        System.out.println("Thread 1 Priority: " + t1.getPriority());
        System.out.println("Thread 2 Priority: " + t2.getPriority());
        System.out.println("Thread 3 Priority: " + t3.getPriority());
    }
}

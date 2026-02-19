class PriorityThread extends Thread {

    PriorityThread(String name) {
        super(name);   // Set thread name
    }

    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {

        PriorityThread t1 = new PriorityThread("Thread 1");
        PriorityThread t2 = new PriorityThread("Thread 2");
        PriorityThread t3 = new PriorityThread("Thread 3");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}

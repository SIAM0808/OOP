class newThread implements Runnable {
    static int count = 0;
    String tmp;

    newThread(String name) {
        tmp = name;
        Thread t = new Thread(this);
        t.setName(name);
        t.start();
        count += 500;
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(tmp + " : " + i);
                Thread.sleep(count);
            }
        } catch (Exception e) {
            System.out.println("Thread " + tmp + " interrupted: " + e);
        }
    }
}

public class multiThread {
    public static void main(String[] args) {
        new newThread("One");
        new newThread("Two");
        new newThread("Three");
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("Main Thread");
        System.out.println("After name change: " + t);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thread exiting");
    }
}
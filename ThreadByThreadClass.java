class newThread extends Thread{
    newThread(){
        super("Child Thread");
        System.out.println("Child Thread: " + this);
        start();
    }
    public void run(){
        try {
            for(int i=5; i>0; --i){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Child Thread Interrupted");
        }
    }
}

public class ThreadByThreadClass {
    public static void main(String[] args) {
        new newThread();
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("Main Thread");
        System.out.println("After name change: " + t);
        for(int i=0; i<5; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Main thread interrupted");
            }
        }
    }
}

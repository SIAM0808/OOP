public class singleThread {
    public static void main(String[] args) {
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

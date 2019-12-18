package Threads_ER;

import java.util.concurrent.atomic.AtomicInteger;
//sited works: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/AtomicInteger.html
public class runnables implements Runnable {
    private AtomicInteger count = new AtomicInteger(1);
    private int chash = new AtomicInteger(0).hashCode();
    //Returns a hash code value for each object
    // supporting hash tables like HashMap.
    @Override
    public void run() {
        for (int i=5; i>0; i--) {
            System.out.println("Hash Code: "+chash+" runnable is processing... " + count.getAndDecrement());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

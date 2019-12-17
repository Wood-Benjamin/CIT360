package Threads_ER;

public class main {
    public static void main(String[] args) {
        //=====Threads====//
        //main thread
        System.out.println("Main Thread Begins:");

        //Threads with Runnables Inside
        Thread thread1 = new Thread(new runnables());
        System.out.println("Here begins the FIRST thread: " + thread1);
        thread1.start();

        Thread thread2 = new Thread(new runnables());
        System.out.println("Here begins the SECOND thread: " + thread2);
        thread2.start();


        //=====Executor=====//
        System.out.println("Begin Execution:");
        new eXecutors();
        System.out.println("EXECUTED.");

        System.out.println("Main Thread is closed.");
    }
}

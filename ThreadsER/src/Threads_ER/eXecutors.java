package Threads_ER;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//sited works: https://www.geeksforgeeks.org/java/
public class eXecutors {
    {System.out.println("Executor Pool:");

        ExecutorService exService = Executors.newFixedThreadPool(4);

        exService.execute(new runnables());
        exService.execute(new runnables());
        exService.execute(new runnables());
        exService.execute(new runnables());
        exService.shutdown();


    System.out.println("Executor is shutting down...");}
}
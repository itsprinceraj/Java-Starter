package MultiThreading;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();

        System.out.println("first 1");
        t1.setPriority(Thread.MIN_PRIORITY);  // you can set Priority of the threads, but it's not guaranteed that the thread will be executed 1st, it totally depends upon computer and their resources;
        t1.start();
        System.out.println("Second 2");
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        t1.join();  // wherever join is applied, then that thread will wait until the completion of the joining thread; in this case main thread will wait to complete the execution of t1 and t3 will also wait cause main thread is stopped;
        System.out.println("Third 3");
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();

        System.out.println(Thread.currentThread().getName());

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println( " " + totalTime);



//Note: It's too difficult to tell that which thread will start first or complete the task first;


    }
}

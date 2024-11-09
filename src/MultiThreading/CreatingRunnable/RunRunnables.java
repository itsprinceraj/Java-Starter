package MultiThreading.CreatingRunnable;

public class RunRunnables {
    public static void main(String[] args) {

        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

//when implementing Runnable we do not have any start() method like Extending Thread;
// So here we have to call the tasks in Thread constructor and then call start method;

//        1st;
        new Thread(p1).start();  // no need to take instance;
        new Thread(p2).start();
        new Thread(p3).start();


//        2nd;

//        Thread t1 = new Thread(p1);
//        Thread t2 = new Thread(p2);
//        Thread t3 = new Thread(p3);
//        t1.start();
//        t2.start();
//        t3.start();

        System.out.printf("%s %s",Thread.currentThread().getName(),"Task Completed");
    }
}

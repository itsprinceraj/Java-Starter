package MultiThreading;

public class Tasks {
}

//1st way to create a thread;


// Create first task or thread;
class Task1 extends Thread{

    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d* ", i );
        }
        System.out.println("Task Complete " +Thread.currentThread().getName());
    }
}


// Second Task;
class Task2 extends Thread{

    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d$ ", i );
        }
        System.out.println("Task Complete " +Thread.currentThread().getName());

    }
}


//Third task
class Task3 extends Thread{

    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d# ", i );
        }
        System.out.println("Task Complete " +Thread.currentThread().getName());

    }
}

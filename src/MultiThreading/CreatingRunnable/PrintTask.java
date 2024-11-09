package MultiThreading.CreatingRunnable;

public class PrintTask implements Runnable{
    public void run(){
        for (int i = 1; i <= 100; i++) {
        System.out.printf("%d%c ", i,targetChar );
        }
        System.out.printf("%s %s",Thread.currentThread().getName(),"Task Completed");
    }


//     constructor andr banta hai;

    private final char targetChar;

    public PrintTask(char target){
        this.targetChar = target;

    }
}


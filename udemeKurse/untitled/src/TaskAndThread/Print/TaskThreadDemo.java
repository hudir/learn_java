package TaskAndThread.Print;

public class TaskThreadDemo {

    public static void main(String[] args) {
        // Create tasks
        Runnable printA = new PrintChar( 'a', 100);
        Runnable printB = new PrintChar( 'b', 100);
        Runnable print100 = new PrintNum(100);

        // Create threads
        Thread


    }
}

class PrintChar implements Runnable {
    private  char charToPrint;
    private  int times;

    public PrintChar(char c, int t) {
        charToPrint = c;
        times = t;
    }

    public void run() {
        for (int i = 0; i < times; i++) System.out.println(charToPrint);
    }
}
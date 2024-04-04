// Defining a Thread From Thread Class
class MyThread extends Thread{
    // Thread class run method: job of thread
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child Thread");
        }
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        // Instantiating a Thread
        MyThread t = new MyThread();
        // starting a Thread
        t.start();
        // After this line, job of main method(Thread)
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread");
        }
    }
}

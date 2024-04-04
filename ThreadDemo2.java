// Defining a Thread from Runnable interface
class MyRunnable implements Runnable{
    // job of thread
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Child Thread");
        }
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        // Creating my class object
        MyRunnable r = new MyRunnable();
        // instantiating the thread
        Thread t = new Thread(r);
        // starting the thread
        t.start();
        // After this line, main thread is executing
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread");
        }
    }
}

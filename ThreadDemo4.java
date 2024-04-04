class MyThread extends Thread{
  public void run(){
    System.out.println("run method: " + Thread.currentThread().getPriority());
  }
}

public class ThreadDemo4 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread.currentThread().setPriority(8);
        t.start();
        // Thread.currentThread().setPriority(6);
        System.out.println("Main(): " + Thread.currentThread().getPriority());
    }
}


class MyThread extends Thread{
    public void run(){
        System.out.println("This run() line is executed by: " + Thread.currentThread().getName());
    }
}
public class ThreadDemo3 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.out.println("This Main() line is executed by: " + Thread.currentThread().getName());
        // Thread.currentThread().setName("Th");
        // System.out.println(10/0);
    }
}

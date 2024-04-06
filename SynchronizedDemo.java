class Display{
    public synchronized void wish(String name){
        for(int i = 0; i < 10; i++){
            System.out.print("Good Morning: ");
            try{
                Thread.sleep(1000);
                System.out.println(name);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d, String name){
        this.d = d;
        this.name = name;
    }
    public void run(){
        d.wish(name);
    }
}
public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t0 = new MyThread(d, "Avinash");
        MyThread t1 = new MyThread(d, "Akash");
        MyThread t2 = new MyThread(d, "Arshi");
        MyThread t3 = new MyThread(d, "Avni");
        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}

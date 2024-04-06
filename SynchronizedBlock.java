class Display{
    public void displayn(){
        ;;;;;;; // 1 lakh lines of code
        synchronized(this){
            for(int i = 0; i < 10; i++){
                System.out.print(i + " ");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        ;;;;;;; // 1 lakh lines of code
    }

    public void displayc(){
        ;;;;;;; // 1 lakh lines of code
        synchronized(this){
            for(int i = 65; i < 75; i++){
                System.out.print((char)i + " ");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        ;;;;;;; // 1 lakh lines of code
    }
}
class MyThread1 extends Thread{
    Display d;
    MyThread1(Display d){
        this.d = d;
    }
    public void run(){
        d.displayn();
    }
}
class MyThread2 extends Thread{
    Display d;
    MyThread2(Display d){
        this.d = d;
    }
    public void run(){
        d.displayc();
    }
}
public class SynchronizedBlock {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);
        t1.start();
        t2.start();
    }
}

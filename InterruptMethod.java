class MyThread extends Thread{
    public void run(){
        try{
            for(int i = 1; i <=10; i++){
                System.out.println("I am a Lazy Thread");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("I got Interrupted");
        }
    }
}
public class InterruptMethod {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        t.interrupt();
        System.out.println("End of Main Thread");
    }
}

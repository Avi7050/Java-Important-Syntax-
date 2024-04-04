/**         Type - 2
 *  If child thread(Girl Thread want to wait for the completion of Main thread(Boy Thread)), 
 * then Child thread is calling join() method on Main thread(Boy.join() type)
 */
class MyThread extends Thread{
    static Thread mt;
    public void run(){
        for(int i = 0; i <= 10; i++){
            try{
                mt.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Girl Thread");
        }
    }
}
public class JoinMethod2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread.mt = Thread.currentThread();
        MyThread t = new MyThread();
        t.start();
        for(int i = 0; i <= 10; i++){
            System.out.println("Boy Thread");
            Thread.sleep(1000);
        }
    }
}

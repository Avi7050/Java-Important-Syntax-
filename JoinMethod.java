/**     Type - 1  
 * If main thread(Boy Thread want to wait for the completion of child thread(Girl Thread)), 
 * then main thread is calling join() method on child thread(Girl.join() type)
 */
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Girl Thread");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join(5000);
        for (int i = 0; i < 10; i++) {
            System.out.println("Boy Thread");
        }
    }
}

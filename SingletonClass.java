/** 
 * Creating our own Singleton Class:
 *     For a class, if only one object is reqd to create and it can be reused for same requirement multiple times, this makes performance *     better and memory utilization is also decreased, it is termed as Singleton Class.    
 *     Ex: Runtime Class, ServiceLocator Class, BussinessDeligate Class
 * */ 

 // Approach 1: To Create the object at the beginning
 /* 
class Test{

    // private static variable
    private static Test t = new Test();

    // private Constructor
    private Test(){
    }

    //public factory() method
    public static Test getTest(){
        return t;
    }
}
*/
// Approach 2: To create the Object if required

class Test{

     // private static variable
    private static Test t = null;

     // private Constructor
    private Test(){
    }

    //public factory() method
    public static Test getTest(){
        if(t == null){
            t = new Test();
        }
        return t;
    }
}
public class SingletonClass{
    public static void main(String[] args) {

        System.out.println("Ctreating Ist object");
        Test t1 = Test.getTest();
        System.out.println(t1);

        System.out.println("Ctreating 2nd object");
        Test t2 = Test.getTest();
        System.out.println(t2);
    }
}
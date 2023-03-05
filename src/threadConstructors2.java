class theThread implements Runnable{
    public void thisThread (Runnable r,String name){
    }
    @Override
    public void run() {
        System.out.println("this is the thread");
    }
}

public class threadConstructors2 {
    public static void main(String[] args) {
        theThread t = new theThread();
        Thread t2 = new Thread("zishan");
        t2.start();
        System.out.println(t2.getId());
        System.out.println(t2.getName());
        }
    }

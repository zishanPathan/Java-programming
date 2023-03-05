
class thread1 extends Thread{
    public thread1 (String name){
        super(name);
    }
    public void run(){
        System.out.println("this is the thread"+getName());
    }
}
class thread2 extends Thread {
    public thread2(String name) {
        super(name);
    }
}

public class threadPrioritie {
    public static void main(String[] args) {
        thread1 t = new thread1("zishan1");
        thread1 t2 = new thread1("zishan2");
        thread1 t3 = new thread1("zishan3");
        thread1 t4 = new thread1("zishan4");
        thread1 t5 = new thread1("zishan5");
        t5.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
       t.start();
       t2.start();
       t3.start();
       t4.start();
       t5.start();}
}


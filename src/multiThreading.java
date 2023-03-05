//creating the thread by extending thread class
 /*class myThread extends Thread {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("cook the food");
            i++;
        }
    }
}
 class myThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("chating with her");
            i++;
        }
    }
}
public class multiThreading {
        public static void main(String[] args) {
            myThread t1 = new myThread();
            myThread1 t2 = new myThread1();
            t1.start();
            t2.start();

        }
    }

  */
//creating thread by implementing runnable interface
class myThread implements Runnable {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("i am thread 0");
            i++;
        }
    }
}
    class myThread1 implements Runnable{
        public void run(){
            int i = 0;
            while(i<1000){
                System.out.println("i am thread 1");
                i++;
            }
        }
}
public class multiThreading {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        Thread t0 = new Thread(t1);
        t0.start();
        myThread1 t2 = new myThread1();
        Thread t = new Thread(t2);
        t.start();

    }
}



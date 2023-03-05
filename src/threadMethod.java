
class thr extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<100){
            System.out.println("hello thread one");
        i++;
        }
        try{
        Thread.sleep(100);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
class thr2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i< 100){
            System.out.println("hello thread two");
            i++;
        }
    }
}


public class threadMethod {
    public static void main(String[] args) {
        thr t = new thr();
        thr2 t2 = new thr2();
        t.start();
   /*     try {
        t.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

    */
        t2.start();
    }
}

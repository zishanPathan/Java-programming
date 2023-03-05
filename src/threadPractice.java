class greet extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<100){
            System.out.println("good morning");
            i++;
        }
    }
}
class greet2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<100){

         /*   try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }

          */
            System.out.println("welcome");
            i++;
        }

    }
}

public class threadPractice {
    public static void main(String[] args) {
        greet gm = new greet();
        greet2 welcome = new greet2();
      //  gm.start();
        gm.setPriority(5);
        welcome.setPriority(9);
        System.out.println( gm.getPriority());
        System.out.println(welcome.getPriority());
       // gm.setPriority(Thread.MIN_PRIORITY);
        // welcome.setPriority(Thread.MAX_PRIORITY);
       // welcome.start();
        System.out.println(gm.getState());
      //  welcome.start();
        System.out.println(welcome.getState());
        System.out.println(Thread.currentThread().isAlive());
    }
}



class thisThread extends Thread{
    public thisThread (String name){
        super(name);
    }
   public void run(){
        System.out.println("this is the thread");
    }
}
class nameThread extends Thread{
    public nameThread (String name){
        super(name);
    }
    public void run(){
        System.out.println("this is the 2nd thread");
    }
}

public class threadConstructors {
    public static void main(String[] args) {
        thisThread t1 = new thisThread("zishan");
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        nameThread t2 = new nameThread("pathan");
        t2.start();
        System.out.println(t2.getName());
        System.out.println(t2.getId());
    }
}

class phone {
    public void on(){
        System.out.println("phone is switch on");
    }
    public void ring (){
        System.out.println("phone is ringing..... ");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("playing music...");
    }
    @Override
    public void ring() {
        System.out.println("smartphone is ringing....");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
        phone obj = new smartphone();
        obj.on();
        obj.ring();
    }
}

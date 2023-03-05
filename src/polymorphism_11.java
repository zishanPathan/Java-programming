abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smartTelephone extends telephone{
    void disconnect() {
        System.out.println("the network is disconnect");
    }

    @Override
    void lift() {
        System.out.println("lift the phone");
    }

    @Override
    void ring() {
        System.out.println("ringing...");
    }
}


public class polymorphism_11 {
    public static void main(String[] args) {
        telephone t = new smartTelephone();
        t.ring();
    }
}

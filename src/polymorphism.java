interface media{
    void playMusic();
}
interface gps{
    void location();
}
interface camera{
    void clickPics();
}
class smartPhone implements media,gps,camera{
    @Override
    public void playMusic() {
        System.out.println("play the music");
    }

    @Override
    public void location() {
        System.out.println("turn on the location");
    }

    @Override
    public void clickPics(){
        System.out.println("click the pictures");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        //this is the example of polymorphism
        gps g = new smartPhone();//methods present in gps only valid now
        g.location();
    }
}

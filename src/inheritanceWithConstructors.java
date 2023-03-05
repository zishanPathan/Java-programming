class base{
    base(){
        System.out.println("i am a base class const");
    }
}
class drieved extends base{
    drieved(){
        System.out.println("drived class const");
    }
    drieved(int x , int y){
        System.out.println("drived"+x+y);

    }
    drieved(int x){
        System.out.println("drieved variable:"+x);
    }

}  class drieved2 extends base{
    drieved2(){
        System.out.println("drived 2 const");
    }
}

public class inheritanceWithConstructors {
    public static void main(String[] args) {
        drieved d = new drieved(4);
       drieved2 d2 = new drieved2();


    }
}

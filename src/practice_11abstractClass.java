abstract class pen{
    abstract void write();
    abstract void refil();
}
class FountainPen extends pen{
    @Override
    void refil() {
        System.out.println("put the new refil");
    }

    @Override
    void write() {
        System.out.println("write with fountain pen");
    }
    void change (){
        System.out.println("chane the pen");
    }
}
public class practice_11abstractClass {
    public static void main(String[] args) {
      FountainPen pen = new FountainPen();
      pen.change();
      pen.refil();
      pen.write();
    }
}

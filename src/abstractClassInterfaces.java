 abstract class parent{
    public void hello(){
        System.out.println("hello");
    }
    abstract void greet();
}
class child extends parent{
    @Override
   public void greet() {
        System.out.println("hey there i am 1st child");
    }
}
class child2 extends parent{
    public void greet(){
        System.out.println("hey there i am 2nd child");
    }
}

public class abstractClassInterfaces {
    public static void main(String[] args) {
        child a = new child();
        child2 b = new child2();
    }
}

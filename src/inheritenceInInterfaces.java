
//this is the how inheritence work in interfaces
interface sample{
    void meth1();
    void meth2();
}
interface sample2 extends sample{
    void meth3();
    void meth4();
}
class sample3 implements sample2{
    @Override
    public void meth1() {
        System.out.println("method 1");
    }

    @Override
    public void meth2() {
        System.out.println("method 2");
    }

    @Override
    public void meth3() {
        System.out.println("method 3");
    }

    @Override
    public void meth4() {
        System.out.println("method 4");
    }
}
public class inheritenceInInterfaces {
    public static void main(String[] args) {
        sample3 s3 = new sample3();
        s3.meth1();
        s3.meth2();
        s3.meth3();
        s3.meth4();

    }
}

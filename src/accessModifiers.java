class c{
    public int  a = 10;
    protected int b = 20;
    private int c = 30;
    int d = 40;
    void using(){
        System.out.println(a+b+c+d);
    }
}

public class accessModifiers {
    public static void main(String[] args) {
    c r = new c();
      //  r.using();//we can use all the access modifiers in class
       // System.out.println(r.a+r.b+r.d);//we can't use private access modifier in same package like this



    }
}

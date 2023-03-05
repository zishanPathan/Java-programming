class a {
    int x;
    public int harry(){
        return 4;
    }
    public void math2(){
        System.out.println("i am method 2 of class a ");
    }
    static class b extends a{
        public void math3(){
            System.out.println("i am method 3 of class b");
        }

        @Override
        public void math2() {
            System.out.println("i am method 2 of class b");
        }
    }

}

public class overridingMethods {
    public static void main(String[] args) {
        a A = new a();
        A.math2();
        a.b B = new a.b();
        B.math2();

    }
}

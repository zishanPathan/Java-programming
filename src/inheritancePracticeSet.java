class circle{
    int radius;
    public circle(int r){
        radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder2 extends circle{
    int height;
   public cylinder2(int r ,int h){
       super(r);
       height=h;
   }
}

public class inheritancePracticeSet {
    public static void main(String[] args) {
        circle objc = new circle(12);
        cylinder2 objh = new cylinder2(14 ,12);
        System.out.println(objc.area());
        System.out.println(objh.height+ objh.area());
    }
}

class cylinder{
    int height;
    int radius;

    public cylinder(int height, int radius) {//by constructor
        this.height = height;
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
    public double surface_area(){
         return 2*Math.PI * radius *radius+2*Math.PI* radius*height;

    }
}
public class practiceQuestions {
    public static void main(String[] args) {
      cylinder a = new cylinder(12,9);
   //   a.setHeight(12);
    //  a.setRadius(9);
        System.out.println("height of the cylinder : "+a.getHeight());
        System.out.println("radius of the cylinder : "+a.getRadius());
        System.out.println("volume of the cylinder : "+a.volume());
        System.out.println("surface area of the cylinder : "+a.surface_area());

    }
}
//pie r square h
//2pier h  + 2 pie r squqre
class monkey{
   void jump(){
       System.out.println("monkey will jump...");
   }
   void bite(){
       System.out.println("monkey can bite...");
   }
   interface basicAnimal{
      void eat();
     void sleep();
   }
  public class human extends monkey implements basicAnimal{
       void speak(){
           System.out.println("hello");
       }
       @Override
       public void eat() {
           System.out.println("eating..");
       }

       @Override
       public void sleep() {
           System.out.println("sleeping");
       }
   }

}

public class practice_11_classes {
    public static void main(String[] args) {
    }
}

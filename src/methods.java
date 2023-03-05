import java.util.Scanner;

public class methods {
   /* static void print() {
        System.out.println("i have done ");
    }
    public static void main(String[] args) {

        print();
    }

    }

   public static void main(String[] args) {
       System.out.println("hello world");

    */
   int logic (int x,int y){
      int z;
      if (x>y){
          z = x * y;
      }
      else {
          z = (x+y) *5;
      }
      return z;
  }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int a , b;
      a = sc.nextInt();
      b = sc.nextInt();
      int c;
      methods obj = new methods(); //calling the () by object creation
      c = obj.logic(a,b);
       System.out.println(c);


   }


}
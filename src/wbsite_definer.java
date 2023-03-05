import java.util.Scanner;

public class wbsite_definer {
    public static void main(String[] args) {
        //Q.3
        System.out.println("enter the wbsite name ");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();


        if (website.endsWith(".org")){
            System.out.println("This is an Orgenizational wbsite");}

           else if (website.endsWith(".in")){
                System.out.println("This is an Indian wbsite");}

              else if (website.endsWith(".com")){
                    System.out.println("This is an International wbsite");}
              else {
            System.out.println("invalid input");
                }
    }
}

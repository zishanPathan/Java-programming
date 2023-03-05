class employee{
    int id;
    int salary;
    String name;
    int detail = 65466;
    public void print(){
        System.out.println("this is my id "+id);
        System.out.println("and my name is "+name);
        System.out.println("my salary is "+salary);

    }
    public int details(){
      return detail;
    }
}
public class oops1 {
    public static void main(String[] args) {
        System.out.println("our custom class");
        employee zishan = new employee();//instantiating a new employee object
        employee chitraksh = new employee();//instantiating a new employee object
        //setting attributes (properties) for zishan
        zishan.id = 200;
        zishan.name = "pathan";
        zishan.salary = 85000;
        //setting attributes (properties) for chitraksh
        chitraksh.id = 120;
        chitraksh.name = "chitraksh gupta";
        chitraksh.salary = 55000;
        //printing the attributes (properties)
        System.out.println(zishan.id);
        System.out.println(zishan.name);
        //calling the method print
          zishan.print();
          chitraksh.print();
         int detail = chitraksh.details();
        System.out.println(chitraksh.details());


    }
}

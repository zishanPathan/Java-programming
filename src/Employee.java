
 class employee1{
    int salary;
    String name;

    int getSalary(){
        return salary;
    }
    String getName(){
        return name;
    }
    void setName(String n){
        name = n;
    }

}
public class Employee {
    public static void main(String[] args) {
        employee1 pathan = new employee1();
     //   pathan.salary = 90;
      //  System.out.println(pathan.getSalary());
        pathan.setName("zishan pathan");
        System.out.println( pathan.getName());


    }
}

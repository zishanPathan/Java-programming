class workers{
    int srNo;
    int salary ;
    String name;
    public workers(int rs){
     salary = rs;
    }
}

public class opps3 {
    public static void main(String[] args) {
        //cunstructor overloaded
        workers list = new workers(10000);
        list.salary=15000;
        System.out.println(list.salary);
        System.out.println(list.salary);


    }

}

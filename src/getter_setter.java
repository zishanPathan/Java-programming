class myEmployee{
    int id;
    String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

}

public class getter_setter {
    public static void main(String[] args) {
        myEmployee zishan = new myEmployee();
        zishan.setName("this_is_zishan");
        System.out.println(zishan.getName());
        zishan.setId(250);
        System.out.println(zishan.getId());

    }
}

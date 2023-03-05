class animal {
    String barking;
    int speed;
    String type;

}
    class dog extends animal{
    String name;
}


public class inheritrnce {
    public static void main(String[] args) {
        dog d = new dog();
        d.name ="tommy";
        d.type = "domastic";
        d.barking ="yup the dog is barking";
        d.speed = 5;
        System.out.println(d.name);
        System.out.println(d.barking);
        System.out.println(d.type);
        System.out.println(d.speed);




    }
}

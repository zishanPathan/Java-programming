//interface one declared the bicycle attributes
interface bicycle{
    int a = 45;//this is the final value cannot be change
    void speedUp(int increment);
    void applyBreak(int decremrnt);
}
//interface two declared the bycle's horn attributes
interface horn{
    void blowHorn();
    void noHorn();
}
//we can make multiple interfaces and add them in one class
class avonCycle implements bicycle , horn{
    @Override
    public void speedUp(int increment) {
        System.out.println("speed is up");
    }

    @Override
    public void applyBreak(int decremrnt) {
        System.out.println("speed is down");
    }

    @Override
    public void blowHorn() {
        System.out.println("horn will sound");
    }
    @Override
    public void noHorn() {
        System.out.println("stop the horn");
    }
}


public class interfaces {
    public static void main(String[] args) {
        avonCycle a = new avonCycle();//creating the object of the class avonCycle
        a.applyBreak(1);
        a.speedUp(1);
        a.blowHorn();
        a.noHorn();
        System.out.println(a.a);
    }
}

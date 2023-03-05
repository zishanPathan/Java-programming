class squareA{
  private int side;

    public void setSide(int side) {
        this.side = side*side;
    }

    public int getSide() {
        return side;
    }
    public int perimeter (){
        return 4*side;
    }
}

public class square {
    public static void main(String[] args) {
        squareA sq = new squareA();
        sq.setSide(3);
        System.out.println(sq.getSide());
        System.out.println(sq.perimeter());

    }
}
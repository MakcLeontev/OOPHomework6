package figure.data;

public class Square extends Rectangle{
    int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

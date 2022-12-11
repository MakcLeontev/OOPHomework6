package figure.data;

import java.sql.Array;

public class Rectangle extends Polygon{
    int firstSide;
    int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        super(new int[]{firstSide, secondSide});
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public double area(Rectangle rectangle){
        return rectangle.getFirstSide()*rectangle.getSecondSide();
    }

}

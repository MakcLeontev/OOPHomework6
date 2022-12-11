package figure.data;

public class Triangle extends Polygon{
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        super(new int[]{firstSide, secondSide, thirdSide});
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
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

    public int getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double area(Triangle triangle){
        int p = perimeter(triangle)/2;
        return Math.sqrt(p*(p- triangle.getFirstSide())*(p- triangle.getSecondSide())*(p-triangle.getThirdSide()));
    }
}

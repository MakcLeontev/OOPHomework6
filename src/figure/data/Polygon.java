package figure.data;


import figure.service.IPerimeter;

public abstract class Polygon extends Figure implements IPerimeter {
    private int sides[];

    Polygon(int[] sides) {
        for (int side:sides) {
            if (side<=0){
                throw new IllegalStateException("Incorrect side");
            }
        }
        this.sides = sides;
    }

    public int[] getSides() {
        return sides;
    }

    public void setSides(int[] sides) {
        this.sides = sides;
    }
}

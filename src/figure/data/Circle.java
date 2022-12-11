package figure.data;

import figure.service.ILengthtable;

public class Circle extends Figure implements ILengthtable {
    private int radius;

    public Circle(int radius) {
        if (radius<=0){
            throw new IllegalStateException("Incorrect radius");
        }
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area(Circle circle){
        return 2*3.14 * Math.pow(circle.getRadius(), 2);
        }
    }


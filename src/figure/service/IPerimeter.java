package figure.service;

import figure.data.Polygon;

public interface IPerimeter {
     default int perimeter(Polygon polygon){
        int[]sides = polygon.getSides();
        int p = 0;
        for (int side:sides) {
            p+=side;
        }
        return p;
    }
}

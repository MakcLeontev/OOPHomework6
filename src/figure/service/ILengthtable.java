package figure.service;

import figure.data.Circle;

public interface ILengthtable {
    default double length(Circle circle){
        return 2*3.14 * circle.getRadius();
    }
}

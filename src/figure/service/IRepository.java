package figure.service;

import figure.data.Figure;

public interface IRepository {
    default void add(Figure figure){
    }
    default void value(){
    }
}

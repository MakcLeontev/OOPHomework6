package figure.repository;

import figure.data.*;
import figure.service.IRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FiguresRepository extends Figure implements IRepository {
    List<Figure> figureCollections = new ArrayList<>();

    public FiguresRepository() {
        super();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public void setArea(double area) {
        super.setArea(area);
    }

    public FiguresRepository(List<Figure> figureCollections) {
        this.figureCollections = figureCollections;
    }

    public List<Figure> getFigureCollections() {
        return figureCollections;
    }

    public void setFigureCollections(List<Figure> figureCollections) {
        this.figureCollections = figureCollections;
    }

    public void addFigure(Figure figure){
        figureCollections.add(figure);
    }

    public List<Integer> allPerimeters(){
        List<Figure>figures = getFigureCollections();
        List<Integer>perimeters= new ArrayList<>();
        for (Figure figure:figures) {
            if (figure instanceof Circle){
            }else {
                Polygon polygon = (Polygon)figure;
                perimeters.add(polygon.perimeter(polygon));
            }
        }
        return perimeters;
    }
    public List<Double> allArea(){
        List<Figure>figures = getFigureCollections();
        List<Double>areas= new ArrayList<>();
        for (Figure figure:figures) {
            if (figure instanceof Rectangle){
                Polygon polygon = (Polygon)figure;
                Rectangle rectangle = (Rectangle)polygon;
                areas.add((rectangle.area(rectangle)));
            }
            if (figure instanceof Square){
                Polygon polygon = (Polygon)figure;
                Rectangle rectangle = (Rectangle)polygon;
                Square square = (Square)rectangle;
                areas.add((square.area(square)));
            }
            if (figure instanceof Triangle){
                Polygon polygon = (Polygon)figure;
                Triangle triangle = (Triangle) polygon;
                areas.add((triangle.area(triangle)));
            }
            if (figure instanceof Circle){
                areas.add(((Circle) figure).area((Circle) figure));
            }
        }
        return areas;
    }
    public List<Double> allLength() {
        List<Figure> figures = getFigureCollections();
        List<Double> lengths = new ArrayList<>();
        for (Figure figure : figures) {
            if (figure instanceof Circle) {
                lengths.add(((Circle) figure).length((Circle) figure));
            }
        }
        return lengths;
    }
}

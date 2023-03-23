package TaskFour;

import java.util.ArrayList;

public class ShapeBuilder {
    ArrayList<Shape> shapes = new ArrayList<>();
    public void addShape(Shape s){
        shapes.add(s);
    }
    public double getTotalArea(ArrayList<Shape> list){
        int total = 0;
        for(Shape s : list){
            total += s.getArea();
        }
        return total;
    }
}

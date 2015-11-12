package patterns.structural.composite.composite;

import java.util.ArrayList;
import java.util.List;

import patterns.structural.composite.base.Shape;

public class Drawing 
    implements Shape
{

    private List<Shape> shapes = new ArrayList<Shape>();
     
    @Override
    public void draw(String fillColor)
    {
        for(Shape s : shapes) {
            s.draw(fillColor);
        }
    }   

    public void add(Shape shape) {
        shapes.add(shape);
        System.out.println("added "+shape);
    }
    
    public void remove(Shape shape) {
        shapes.remove(shape);
        System.out.println("Removed "+shape);
    }
    
    public void clear() {
        shapes.clear();
        System.out.println("Cleared shapes");
    }    
}

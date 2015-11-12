package patterns.structural.composite.leaf_objects;

import patterns.structural.composite.base.Shape;

public class Circle implements Shape
{

    @Override
    public void draw(String fillColor)
    {
        System.out.println("Drawing Circle with color "+fillColor);        
    }

}

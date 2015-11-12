package patterns.structural.composite.leaf_objects;

import patterns.structural.composite.base.Shape;

public class Triangle implements Shape
{

    @Override
    public void draw(String fillColor)
    {
        System.out.println("Drawing Triangle with color "+fillColor);        
    }

}

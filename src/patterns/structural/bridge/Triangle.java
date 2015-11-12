package patterns.structural.bridge;

public class Triangle 
    extends Shape
{

    public Triangle(Color color)
    {
        super(color);
    }

    @Override
    public void applyColor()
    {
        System.out.println("Applying color on Triangle, color is ");        
        color.applyColor();
    }
}

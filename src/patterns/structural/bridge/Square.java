package patterns.structural.bridge;

public class Square 
    extends Shape
{

    public Square(Color color)
    {
        super(color);
    }

    @Override
    public void applyColor()
    {
        System.out.println("Applying color on Square, color is ");        
        color.applyColor();
    }
}

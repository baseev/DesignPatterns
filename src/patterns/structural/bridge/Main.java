package patterns.structural.bridge;

public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();
        
        Shape square = new Square(new GreenColor());
        square.applyColor();
    }

}

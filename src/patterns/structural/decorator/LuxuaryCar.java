package patterns.structural.decorator;

public class LuxuaryCar
    extends ModifiedCar
{

    public LuxuaryCar(Car car)
    {
        super(car);
    }
    
    @Override
    public void assemble()
    {
        car.assemble();
        System.out.println("Luxuary Car");  
    }  
}

package patterns.structural.decorator;

public class SportsCar
    extends ModifiedCar
{

    public SportsCar(Car car)
    {
        super(car);
    }
    
    @Override
    public void assemble()
    {
        car.assemble();
        System.out.println("Sports Car");  
    }  
}

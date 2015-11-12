package patterns.structural.decorator;

public abstract class ModifiedCar
    implements Car
{
    protected Car car = null;
    public ModifiedCar(Car car){
        this.car = car;
    }

    @Override
    public void assemble()
    {
        System.out.println("Modified Car");        
    }    
}

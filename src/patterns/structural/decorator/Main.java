package patterns.structural.decorator;

public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        
        Car luxuaryCar = new LuxuaryCar(new BasicCar());
        luxuaryCar.assemble();
    }

}

package patterns.behavorial.chain_of_responsibility;

public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Dollar500Dispenser c1 = new Dollar500Dispenser();
        Dollar100Dispenser  c2 = new Dollar100Dispenser();
        c1.setNextChain(c2);
        
        c1.dispense(new Currency(500));
    }

}

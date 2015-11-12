package patterns.behavorial.chain_of_responsibility;

public class Dollar500Dispenser
    implements DispenseChain
{
    private DispenseChain chain;
    
    @Override
    public void setNextChain(DispenseChain chain)
    {
        this.chain = chain;
    }

    @Override
    public void dispense(Currency curr)
    {
        if(curr.getAmount() > 500) {
            int num = curr.getAmount()/500;
            int remainder = curr.getAmount()%500;
            System.out.println("Dispensing "+num+" 500$ note");
            if(remainder !=0) {
                this.chain.dispense(new Currency(remainder));
            }            
        } else {
            this.chain.dispense(curr);
        }
    }    
}

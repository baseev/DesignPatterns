package patterns.behavorial.chain_of_responsibility;

public class Dollar100Dispenser
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
        if(curr.getAmount() > 100) {
            int num = curr.getAmount()/100;
            int remainder = curr.getAmount()%100;
            System.out.println("Dispensing "+num+" 100$ note");
            if(remainder !=0) {
                this.chain.dispense(new Currency(remainder));
            }            
        } else {
            this.chain.dispense(curr);
        }
    }    
}

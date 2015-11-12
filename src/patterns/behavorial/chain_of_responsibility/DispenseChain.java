package patterns.behavorial.chain_of_responsibility;

public interface DispenseChain
{
    void setNextChain(DispenseChain chain);
    void dispense(Currency curr);
}

package patterns.behavorial.strategy;

public class CreditCardPaymentStrategy
    implements PaymentStrategy
{
    private String name;
    private String cardNo;
    private int cvvNumber;
    
    public CreditCardPaymentStrategy(String name, String cardNo, int cvvNumber) {
        this.name = name;
        this.cardNo = cardNo;
        this.cvvNumber = cvvNumber;
    }
    
    @Override
    public void pay(int amount)
    {
        System.out.println(amount +" paid with credit/debit card");
    }
    
}

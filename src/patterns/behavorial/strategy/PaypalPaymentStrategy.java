package patterns.behavorial.strategy;

public class PaypalPaymentStrategy
    implements PaymentStrategy
{
    private String name;
    private String accountNo;
    private String password;
    
    public PaypalPaymentStrategy(String name, String accountNo, String password) {
        this.name = name;
        this.accountNo = accountNo;
        this.password = password;
    }
    
    @Override
    public void pay(int amount)
    {
        System.out.println(amount +" paid with paypal");
    }
    
}

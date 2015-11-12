package patterns.behavorial.strategy;

public class Main
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();
        
        Item item1 = new Item("coconut", 10);
        Item item2 = new Item("onion", 100);

        cart.addItem(item1);
        cart.addItem(item2);
        
        cart.pay(new PaypalPaymentStrategy("Baseev", "101", "kumar"));
        
    }

}

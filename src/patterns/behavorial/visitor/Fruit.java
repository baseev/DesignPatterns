package patterns.behavorial.visitor;

public class Fruit
    implements ItemElement
{
    private int amount;
    private String name;
    
    public Fruit(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }
    
    public int getAmount() {
        return amount;
    }
    
    public String getIsbnNumber() {
        return name;
    }
    
    
    @Override
    public int accept(ShoppingCartVisitor shoppingCartVisitor)
    {
        return shoppingCartVisitor.visit(this);
    }    
}

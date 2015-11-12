package patterns.behavorial.visitor;

public class Book
    implements ItemElement
{
    private int amount;
    private String isbnNumber;
    
    public Book(int amount, String isbnNumber) {
        this.amount = amount;
        this.isbnNumber = isbnNumber;
    }
    
    public int getAmount() {
        return amount;
    }
    
    public String getIsbnNumber() {
        return isbnNumber;
    }
    
    
    @Override
    public int accept(ShoppingCartVisitor shoppingCartVisitor)
    {
        return shoppingCartVisitor.visit(this);
    }    
}

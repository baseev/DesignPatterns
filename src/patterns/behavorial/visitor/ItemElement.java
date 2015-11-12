package patterns.behavorial.visitor;

public interface ItemElement
{
    public int accept(ShoppingCartVisitor shoppingCartVisitor);
}

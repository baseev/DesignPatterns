package patterns.behavorial.mediator;

//Colleagaue interface
public abstract class User
{
    protected ChatMediator chatMediator;
    protected String name;
    
    public User(ChatMediator charMediator, String name) {
        this.chatMediator = charMediator;
        this.name = name;
    }

    public abstract void send(String msg);
    
    public abstract void receive(String msg);
}

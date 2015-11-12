package patterns.behavorial.mediator;

//Mediator interface
public interface ChatMediator
{
    public void sendMessage(String msg, User user);
    
    void adduser(User user);

}

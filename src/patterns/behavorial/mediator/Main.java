package patterns.behavorial.mediator;

public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Baseev");
        User user2 = new UserImpl(mediator, "Sapna");
        User user3 = new UserImpl(mediator, "Ishaan");
        
        mediator.adduser(user1);
        mediator.adduser(user2);
        mediator.adduser(user3);
        
        user3.send("Hi");
    }

}

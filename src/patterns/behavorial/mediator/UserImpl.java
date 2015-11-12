package patterns.behavorial.mediator;


//Concreate colleague
public class UserImpl
    extends User
{

    public UserImpl(ChatMediator charMediator, String name)
    {
        super(charMediator, name);
    }

    @Override
    public void send(String msg)
    {
       System.out.println("Sending chat msg "+msg);
       chatMediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg)
    {        
        System.out.println(this.name+": Received Message:"+msg);
    }

}

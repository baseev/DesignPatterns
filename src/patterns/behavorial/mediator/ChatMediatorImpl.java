package patterns.behavorial.mediator;

import java.util.ArrayList;
import java.util.List;

//Concreate mediator
public class ChatMediatorImpl
    implements ChatMediator
{
    private List<User> users;
    
    public ChatMediatorImpl() {
        this.users = new ArrayList<User>();
    }
    
    @Override
    public void sendMessage(String msg, User user)
    {
        for(User u : this.users) {
            if(u != user) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void adduser(User user)
    {
        this.users.add(user);
    }
    
}

package patterns.behavorial.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic
    implements Subject
{
    private List<Observer> observers;
    private final Object mutex = new Object();
    private boolean changed;
    private String message;
    
    public MyTopic() {
        observers = new ArrayList<Observer>();
    }
    
    
    @Override
    public void regsiter(Observer obj)
    {
        if(obj == null) {
            throw new NullPointerException("Observer is null");
        }
        
        synchronized(mutex) {
            if(!observers.contains(obj)) {
                observers.add(obj);
            }
        }
    }

    @Override
    public void unRegister(Observer obj)
    {
        synchronized (mutex) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers()
    {
       List<Observer> observerLocal = null;       
       synchronized (mutex) {
           if(!changed) {
               return;
           }
           observerLocal = new ArrayList<Observer>(this.observers);
           this.changed = false;
       }
       
       for(Observer obj : observerLocal) {
           obj.update();
       }
    }

    @Override
    public Object getUpdate(Observer obj)
    {
        return this.message;
    }
    
    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic:"+msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}

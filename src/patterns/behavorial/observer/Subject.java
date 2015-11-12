package patterns.behavorial.observer;

public interface Subject
{
    public void regsiter(Observer obj);
    public void unRegister(Observer obj);
    public void notifyObservers();
    public Object getUpdate(Observer obj);
}

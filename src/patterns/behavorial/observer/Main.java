package patterns.behavorial.observer;

public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        MyTopic topic = new MyTopic();
        
        Observer obj1 = new MyTopicSubscriber("Object 1");
        Observer obj2 = new MyTopicSubscriber("Object 2");
        Observer obj3 = new MyTopicSubscriber("Object 3");

        topic.regsiter(obj1);
        topic.regsiter(obj2);
        topic.regsiter(obj3);
        
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);
        
        obj1.update();
        
        
        topic.postMessage("New Message");


    }

}

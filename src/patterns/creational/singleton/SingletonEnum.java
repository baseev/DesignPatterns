package patterns.creational.singleton;

public class SingletonEnum
{

    private int value = 10;
    
    public enum instance {
        INSTANCE;
        
        public void getValue() {
            //System.out.println("getValue : "+value);
        }
    }
    
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        //Singleton.instance.getValue();
    }

}

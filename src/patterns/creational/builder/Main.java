package patterns.creational.builder;

public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Computer computer =  new Computer.ComputerBuilder().setHDD(500l).setRAM("SSD").build();
        

    }

}

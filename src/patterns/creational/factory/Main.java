package patterns.creational.factory;

public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Computer pc = ComputerFactory.getComputer("PC", "64GB", "500GB");
        Computer server = ComputerFactory.getComputer("Server", "512GB", "10TB");
        
        System.out.println("pc = "+pc);
        System.out.println("server = "+server);
    }

}

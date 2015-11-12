package patterns.creational.abstract_factory;

public class Main
{
    public static void main(String[] args)
    {
       Computer PC = ComputerFactory.getComputer(new PCFactory("8GB", "1TB"));
       Computer server = ComputerFactory.getComputer(new ServerFactory("8GB", "1TB"));
       
       System.out.println("PC = "+PC);
       System.out.println("server"+server);
    }

}

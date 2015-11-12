package patterns.structural.proxy;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        CommandExecutor executor = new CommandExecutorProxy("Baseev", "test");
        executor.runCommand("ls -l");
    }
}

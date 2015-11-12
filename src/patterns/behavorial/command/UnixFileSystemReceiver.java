package patterns.behavorial.command;

public class UnixFileSystemReceiver
    implements FileSystemReceiver 
{

    @Override
    public void openFile()
    {
        System.out.println(" Unix openFile ");
    }

    @Override
    public void writeFile()
    {
        System.out.println(" Unix writeFile ");        
    }

    @Override
    public void closeFile()
    {
        System.out.println(" Unix closeFile ");        
    }

}

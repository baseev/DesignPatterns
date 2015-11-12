package patterns.behavorial.command;

public class WindowsFileSystemReceiver
    implements FileSystemReceiver 
{

    @Override
    public void openFile()
    {
        System.out.println(" Windows openFile ");
    }

    @Override
    public void writeFile()
    {
        System.out.println(" Windows writeFile ");        
    }

    @Override
    public void closeFile()
    {
        System.out.println(" Windows closeFile ");        
    }

}

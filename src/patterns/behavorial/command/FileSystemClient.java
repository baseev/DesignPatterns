package patterns.behavorial.command;

public class FileSystemClient
{

    public static void main(String[] args)
    {
        FileSystemReceiver fsReceiver = FileSystemReceiverUtil.getFileSystem();
        
        OpenFileCommand openFileCommand = new OpenFileCommand(fsReceiver);
        
        FileInvoker file = new FileInvoker(openFileCommand);
        
        file.execute();

    }

}

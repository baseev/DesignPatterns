package patterns.structural.proxy;

import javax.management.RuntimeErrorException;

public class CommandExecutorProxy
    implements CommandExecutor
{
    private boolean isAdmin;
    private CommandExecutor executor;
    
    public CommandExecutorProxy(String user, String password) {
        if("baseev".equalsIgnoreCase(user) && "test".equalsIgnoreCase(password)) {
           this.isAdmin = true;
        }
        
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception
    {
       if(isAdmin) {
           executor.runCommand(cmd);
       } else {
           throw new RuntimeException("Exception");
       }        
    }
}

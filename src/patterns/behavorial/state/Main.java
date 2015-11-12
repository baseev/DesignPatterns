package patterns.behavorial.state;

public class Main
{

    public static void main(String[] args)
    {       
        TVContext tvContext = new TVContext();
        State tvstartState = new TVStartState();
        State tvStopState = new TVStopState();
        
        tvContext.setState(tvStopState);
        tvContext.doAction();
        
        tvContext.setState(tvstartState);
        tvContext.doAction();
    }

}

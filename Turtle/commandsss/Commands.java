package commandsss;
import draw.*;
import turtle_1.*;
public class Commands extends Turtle
{
    //||| Why have a seperate class for each command Miss? can't all commands exist in one command class
    //|||  with different methods corosponding for commands
    private int pace=100;
    private Canvas canva=new Canvas();

    public Commands()
    {
        
    }

    
    public void setpace(int new_pace)
    {
        pace=new_pace;
    }
    public void Square()
    {
        move(pace);    
        turnRight();
        move(pace);  
        turnRight();
        move(pace);  
        turnRight();
        move(pace); 
    }
    
    public void ZigZag()
    {
        move(pace);    
        turnRight();
        move(pace);  
        turnLeft();
        move(pace);  
        turnRight();
        move(pace); 
    }


}

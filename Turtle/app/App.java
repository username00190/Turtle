package app;
import commandsss.*;
import draw.*;
import javax.swing.JFrame;
import pointer.*;


//|||||| I didn't extend Commander here because I feel like that the App might be overwhelmed
public class App 
{
    private Commander AsimMuneer=new Commander();
    Canvas cnvas= new Canvas();
    private Point defaultt;
    public App()
    {
        JFrame frame=new JFrame("Yahya's Frame");
        frame.setSize(900,700);
        frame.add(cnvas);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        defaultt =new Point(450,350);
        AsimMuneer.change_postion(defaultt);
        AsimMuneer.assign_canvas(cnvas);
        
    }

    public void run()
    {
        AsimMuneer.Input();
        AsimMuneer.commandRunner();
        
    }
}

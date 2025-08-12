package turtle_1;
import draw.*;
import pointer.*;

public class Turtle 
{
    private Point position;
    private Point next_position;
    // private Canvas canva=new Canvas();
    private Pen pen=new Pen();
    private int orientor=4;
    
    public Turtle()
    {
        this.position=new Point(50,50);
        pen=new Pen(this.position);
    }
    public Turtle(Point deff)
    {
        this.position=deff;
        pen=new Pen(this.position);
        
    }
    //|||||| I didn't know how to call the above constructor in the Commander class so I made this dedicated fucnction to change
    //||||| position
    public void change_postion(Point neww)
    {
        this.position=neww;
        pen=new Pen(this.position);

    }
    public void assign_canvas(Canvas paper)
    {
        pen.setCanvas(paper);
    }
    
    
    public void start()
    {
        pen.PenDown();
    }
    public void stop()
    {
        pen.PenUp();
    }

    //|||||||||  Miss your idea of changing angles by 90 degrees I was not able to implement 
    //|||||||||  so instead I used method of increment/decrement of x and y value depending on face of turtle and direction
    public void faceUp()
    {
        orientor=4;
        
    }
    public void turnAround()
    {
        orientor+=2;
        if(orientor>4)
            orientor-=4;
    }
    public void turnRight()
    {
        //|||||||||||||||||| Need to acount for two right being 180 degree turn and 
        //|||||||||||||||||| 4 right to be 360 degree turn and every left turn is just right turn in degree - 90 degree 

        //|||||||||||||||||| Well Shit.. 3 rights make a left, now how the hell do I fix that
        //|||||||||||||||||| after a nights sleep I think I have the solution... Hopefully 🤞
        orientor+=1;
        if(orientor>4)
            orientor-=4;
        System.out.println("Right turn, now Orientation of Turtle "+ orientor);

        
    }
    public void turnLeft()
    {
        orientor-=1;
        if(orientor<1)
            orientor=4;
        System.out.println("Left turn, now Orientation of Turtle "+ orientor);
    }
    
    public void move(int paces)
    {
        
        switch (orientor) {
            case 4:
                next_position=new Point(position.getX(),position.getY()-paces);
                break;
                // |||| just realized that the starting position on the screen is the top left corner
                // |||| and to gain height  you need to decrement y value 
            case 2:
                next_position=new Point(position.getX(),position.getY()+paces);
                break;
            case 1:
                next_position=new Point(position.getX()+paces,position.getY());
                break;
            case 3:
                next_position=new Point(position.getX()-paces,position.getY());
                break;
            default:
                break;
        }

        pen.WriteTill(next_position);
        this.position=next_position;
    }
}


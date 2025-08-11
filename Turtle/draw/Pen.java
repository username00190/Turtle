package draw;
import pointer.*;
public class Pen 
{
    private Point Coordinate;
    private Canvas canvas =new Canvas();
    private boolean penUpOrDown=false;

    public Pen()
    {
        this.Coordinate=Coordinate;
    }
    public Pen(Point new_coordinate)
    {
        this.Coordinate=new_coordinate;
    }
    public void setCanvas(Canvas cvs)
    {
        this.canvas=cvs;
    }

    public void PenDown()
    {
        penUpOrDown=true;
    }
    public void PenUp()
    {
        penUpOrDown=false;
    }
    public void WriteTill(Point next_p)
    {
        if(penUpOrDown)
            canvas.addLine(this.Coordinate, next_p);

        this.Coordinate = next_p;
    }
    
}

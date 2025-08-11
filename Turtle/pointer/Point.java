package pointer;
public class Point 
{
    private int x, y;
    public Point() 
    {
        this.x=x;
        this.y=y;
        
    }
    public Point(int x_axis, int y_axis)
    {
        this.x=x_axis;
        this.y=y_axis;
    }

    public void SetX(int new_x)
    {
        this.x=new_x;
    }
    public void SetY(int new_y)
    {
        this.y=new_y;
    }

    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }

    public Point Add(Point another)
    {
        Point temp=new Point();
        temp.x=another.x+this.x;
        temp.y=another.y+this.y;

        return temp;
    }
    public Point Subb(Point another)
    {
        Point temp=new Point();
        temp.x=another.x-this.x;
        temp.y=another.y-this.y;

        return temp;
    }

    
    public String toString() 
    {
        String str="The current point is ("+this.x+", "+this.y+")";
        return str;
    }


}

package draw;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import pointer.*;



public class Canvas extends JPanel
{
    private List<Line> cvs_lines = new ArrayList<>();

    public void addLine(Point p1, Point p2)
    {
        cvs_lines.add(new Line(p1,p2));// arry to store lines
        System.out.println("Line from (" + p1.getX() + ", " + p1.getY() + ")"+
        " to (" + p2.getX() + ", " + p2.getY() + ")");

        repaint();//what does this do?
    }
    //||| I don't get this part, maybe 'drawLine' is prebuilt fn
    //||| for drawing lines, but how would you call this?
    //||| the method takes in variable with data type Graphics
    //||| so how are we suppose to run or use Graphics if we don't know 
    //||| what is in the Graphics class
    //||| what is @override and protected and super. keyword?
    //||| I'm just blindly copying this part from pdf, 
    //||| hopefully I'll understand it later

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Line line : cvs_lines)
        {
            g.drawLine(line.Start.getX(),
            line.Start.getY(), line.End.getX(), line.End.getY());
        }

    }
    
}

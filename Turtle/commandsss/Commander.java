package commandsss;
import draw.*;
import java.util.Scanner;
public class Commander extends Commands
{
    private int Paces=0;
    private Canvas roughpaper;
    String input=new String();
    Scanner commanding_method=new Scanner(System.in);
    Scanner inputs_string=new Scanner(System.in);
    Scanner WhatCommand=new Scanner(System.in);
    Scanner PaceScan=new Scanner(System.in);
    private int commands=0;
    private int method=0;

    
    
    public void CanvasSetter(Canvas fromApp)
    {
        assign_canvas(roughpaper);
    }
    public void Input()
    {
        System.out.println("Enter 1 for prebuilt Command and enter 2 for custom commands : ");
        
        method=commanding_method.nextInt();
        
        if(method==1)
        {
            System.out.println("You have chosen a prebuilt Command please proceed by,");
            System.out.println("Enter 1 for Square Command OR enter 2 for Zigzag Command : ");
            commands=WhatCommand.nextInt();
            
        }
        else
        {
            System.out.println("You have chosen a custom Command please proceed by,");
            System.out.println("Enter your custom String of commands, 'F' to move, '+' to turn right, '-' to turn left and 'B' to turn around : ");
            input=inputs_string.next();
            
            System.out.println("Enter the distance at which you want to move whenever you go forward : ");
            Paces=PaceScan.nextInt();
            
            
        }
    }
    public void commandRunner()
    {
        
        if(method==1)
        {
            start();

            if(commands==1)
                Square();
            
            else if(commands==2)
                ZigZag();

            stop();
        }
        
        else
        {
            start();
            String[] cmnds=new String[input.length()];
            cmnds=input.split("");
            for(String i:cmnds)
            {
                if(i.equals("F"))
                {
                    move(Paces);
                }
                else if(i.equals("+"))
                {
                    turnRight();
                }
                else if(i.equals("-"))
                {
                    turnLeft();
                }
                else if(i.equals("B"))
                {
                    turnAround();
                }
                

            }
            stop();
        }
        
    }

}

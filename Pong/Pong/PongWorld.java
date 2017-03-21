import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class PongWorld  extends World
{
   
    
    public PongWorld()
    {    
   
        super(700, 500, 1);       
        Paddle A = new Paddle("left","right");

        Paddle B = new Paddle("a","s");
        addObject(A, 350, 30);
        addObject(B, 350, 470);
        addObject(new Ball(), 350, 250);
       
    }
}





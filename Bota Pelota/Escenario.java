import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Escenario extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Escenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, true); 
    }
    
    @Override
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            System.out.println("Clic en el Mundo");
            MouseInfo raton = Greenfoot.getMouseInfo();
            System.out.println("Coordenadas x = "+raton.getX()+" , y = "+raton.getY() );
        }
                                        
    }
}

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
        prepare();
    }

    @Override
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            System.out.println("Clic en el Mundo");
            MouseInfo raton = Greenfoot.getMouseInfo();
            System.out.println("Coordenadas x = "+raton.getX()+" , y = "+raton.getY() );
        }

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Jugador jugador = new Jugador();
        addObject(jugador,291,348);
        Pelota pelota = new Pelota();
        addObject(pelota,111,153);
        Pelota pelota2 = new Pelota();
        addObject(pelota2,407,170);
        Pelota pelota3 = new Pelota();
        addObject(pelota3,128,58);
        pelota2.setLocation(399,139);
        Disparo disparo = new Disparo();
        addObject(disparo,297,301);
        removeObject(disparo);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Jugador extends Actor
{
    private boolean disparando;
    public Jugador(){
        disparando = false;
    }
    public void act() 
    {
        //Si presiona la tecla derecha
        if(Greenfoot.isKeyDown("right")){
            //mueve a la derecha
            this.setLocation(this.getX()+5,this.getY());
        }
        
        //Si presiona tecla izquierda
        if(Greenfoot.isKeyDown("left")){
            //mueve a la derecha
            this.setLocation(this.getX()-5,this.getY());
        }
        
        if(Greenfoot.isKeyDown("space") && !disparando){
           Disparo disp = new Disparo();
            World mundo = this.getWorld();
           mundo.addObject(disp, this.getX(), this.getY());
            
           disparando = true; 
           
        }
        
        
        //revisar cuantos disparos hay en el mundo
        World mundo = this.getWorld();
        List lista = mundo.getObjects(Disparo.class);
        if(lista.isEmpty()){
            disparando = false;
        }
    } 
    
    
    
}


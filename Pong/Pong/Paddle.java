import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Paddle  extends Actor
{
    private String A;
    private String B;
    private Greenfoot tecla;
   
  
    
    public Paddle(String a, String b){
        A = a;
        B = b;
    }
    
    @Override
    public void act(){
        
        /*********************************************
         * verifica si se presiono la tecla 
         * A es para left y "a"
         * B es para right y "s"
         **********************************************/
        if(tecla.isKeyDown(A))
            this.setLocation(this.getX()-10, getY());
            
        else if(tecla.isKeyDown(B))
            this.setLocation(this.getX()+10, getY());  
                      
    }      
}



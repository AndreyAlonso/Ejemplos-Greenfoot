import greenfoot.*;
public class Pelota extends Actor
{
    private int incx;
    private int incy;
     

    public Pelota(){
        incx = 10;
        incy = 10;
        
    }
    @Override
    public void act() 
    {
        //Consulta las coordenadas actuales heredadas de Actor
        int posx = this.getX();
        int posy = this.getY();
        
        //Calculamos las nuevas coordenadas
        int nuevox = posx + incx;
        int nuevoy = posy + incy;
        
        //Accedemos al mundo para conocer su tamaño
        World mundo = this.getWorld();
        
        if(nuevox > mundo.getWidth()){  //Rebota en el lado derecho
            incx = -incx;
        }
        
        if(nuevoy > mundo.getHeight()){ //Rebota en la parte de abajo
            incy = -incy;
        }
        
        if(nuevoy < 0){   //Rebota arriba
            incy = -incy;
        }
        
        if(nuevox < 0){ //Rebota izquierda
            incx = -incx;
        }
        
        //Cambiamos de posicion a la pelota
        this.setLocation( nuevox, nuevoy );
        
    }    
}


import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ball  extends Actor
{
    private int incx;
    private int incy;
    private int posx;
    private int posy;
    private int cont1;
    private int cont2;
    private int nivel;
    private World mundo;
    private String p;
    private int contp;
    public Ball(){
        nivel = 1;
        incx = 5;
        incy = 5;
        int mx = 1;
        int my = 1;
        p = "p";
        contp = 0;

        int aleatoriox = Greenfoot.getRandomNumber(10);
        int aleatorioy = Greenfoot.getRandomNumber(10);
        cont1 = 0;
        cont2 = 0;

        if(aleatoriox >5)
        {
            mx=-1;
        }
        if(aleatorioy >5)
        {
            my=-1;
        }
        incx = incx*mx;
        incy = incy*my;
       
    }
    public void act() 
    {
         //consulta las coordenadas actuales heredadas de actor 
        int posx=this.getX();
        int posy=this.getY();
        
      
       
        //calculamos las nuevas coordenadas
        int newx = posx + incx;
        int newy = posy + incy;
        
        //accedemos al mundo para conocer su tamaño
        mundo = this.getWorld();
        mundo.showText(""+cont1, 50,50);
        mundo.showText(""+cont2, 50,450);
        if(contp == 0 && Greenfoot.isKeyDown(p)){
            Greenfoot.stop();
            mundo.repaint();
            mundo.showText("PAUSE",350,450);
            contp = 1;
            
        }
        /*else
        if(Greenfoot.isKeyDown("v")){
            Greenfoot.start();
            mundo.showText("START",350,450);
            contp = 0;
        }*/
        if(nivel == 1)
        {
            mundo.showText("NIVEL 1",350,250);
            mundo.repaint();
        }
        else
            if(nivel == 2){
                mundo.showText("NIVEL 2",350,250);
                mundo.repaint();
                incx = 8;
                incy = 8;
            }
        if(cont1 == 5){
            
            mundo.showText("Jugador 1 gana",250,350);
            mundo.repaint();
            nivel++;
        }
        else if(cont2 == 5){
            
            mundo.showText("Jugador 2 gana",250,350);
            mundo.repaint();
            nivel++;
        }
        if(newx > mundo.getWidth()){ //rebota en el lado derecho
            incx = -incx;
        }
        if(newy > mundo.getHeight()){//rebota en la parte de abajo
            // cont1++;
            incy = -incy;
        }
        if(newx<0 ){
            incx = -incx;
        }
        if(newy<0){
            cont2++;
            incy = -incy;
        }
        if(this.isTouching(Paddle.class))
        {
            incy = -incy;
            
        }
        
        //cambiamos de posicion a la pelota
        this.setLocation(newx,newy);
    } 
       
}



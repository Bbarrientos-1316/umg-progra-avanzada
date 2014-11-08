import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Flecha extends Actor
{
     private Vector force;
    public boolean disp = false;
   
    
    public Flecha()
    {
        force = new Vector();
    }

    public Flecha(Vector force)
    {
        this.force = force;
    }
    
    public void act() 
    {
        force.add(new Vector(90, 0.3));         //Se crea un nuevo vector con 90 grados de direccion y un avance de 0.3.
        GreenfootImage thisImage = getImage();
        World world = getWorld();
        List<Blanco> list =  world.getObjects(Blanco.class);
        Blanco objBlanco = list.get(0);
        GreenfootImage imageBlanco = objBlanco.getImage();
        
        if(getOneIntersectingObject(Muro.class)==null && this.getX()+(thisImage.getHeight()/2)< 
        objBlanco.getX()-imageBlanco.getHeight()/4 || this.getX()+(thisImage.getHeight()/2) >
        objBlanco.getX()+imageBlanco.getHeight()/4){
             setLocation(getX()+(int)force.getX(), getY()+(int)force.getY());       // Trayectoria de la flecha.
             setRotation(force.getDirection());                                     // Angulo que se le dará a la flecha antes de dispararla.
             
        }
        else
        {
            if(getOneIntersectingObject(Muro.class)!=null)
            {
                Muro muro = (Muro)getOneIntersectingObject(Muro.class);
               this.setImage("romper.png");
               Greenfoot.delay(12);                                     // Si golpea el muro se romperá la flecha y el juego se detendra.
               getWorld().removeObject(this);
         
              

            }
           
           else if(this.getY() > objBlanco.getY()-imageBlanco.getWidth()/2){
                setImage("flecha2.png");

                Greenfoot.delay(12);  //Duración antes de desaparecer.
                Greenfoot.playSound("applause.wav");
                Greenfoot.delay(30);
                getWorld().removeObject(this);      //Remueve la flecha.
            }
            else{
                setLocation(getX()+(int)force.getX(), getY()+(int)force.getY());
                setRotation(force.getDirection());
   
                
            }
        
        }
        
    }  
}


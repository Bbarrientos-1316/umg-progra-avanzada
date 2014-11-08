import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Tirador extends Actor
{
   private ForceArrow forceArrow;
    
    public void act() 
    {
        checkClick();
    }
    
    //Este metodo dara velocidad a la flecha para poder llegar al blanco.
    //Entre más hacia atras de "hala" la la flecha mayor será su vel.
    
    private void checkClick()
    {
        World mundo = getWorld();
        if(Greenfoot.mouseDragged(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int dx = mouse.getX()-getX();
            int dy = mouse.getY()-getY();
            if (forceArrow == null) {
                forceArrow = new ForceArrow(dx, dy);
                getWorld().addObject( forceArrow, getX(), getY() );
            }
            else {
                forceArrow.setImage(dx, dy);
            }
        }
        if(Greenfoot.mouseDragEnded(null) && forceArrow != null) {
            getWorld().removeObject(forceArrow);
            forceArrow = null;
            MouseInfo mouse = Greenfoot.getMouseInfo();
            Vector force = new Vector(new Location(mouse.getX(), mouse.getY()), new Location(getX(), getY()));
            force.scale(0.2);
            Flecha arrow = new Flecha(force);
            mundo.addObject(arrow, getX(), getY());
           
        }
    }    
}

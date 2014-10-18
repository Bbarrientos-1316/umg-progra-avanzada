import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Describiendo a Bomba
 * 
 * @author (Grupo Colisiones) 

 */
public class Bomba extends Actor
{
    /**
    Definiedo acciones que realiza la Bomba
     */
    public void act() 
    {
        moveAround();
        eat();
    }
    
    /**
     * Valores otorgados a la Bomba
     */   
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(25) < 5)
        {
            turn(Greenfoot.getRandomNumber(45) - 20);
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
        {
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight() - 5)
        {
            turn(180);
        }
    }
    
   /**
    *  
    */
    public void eat()
    {
        Actor cohete;
        cohete = getOneObjectAtOffset(0, 0, Cohete.class);
        if (cohete!=null)
        {
            World world;
            world = getWorld();
            world.removeObject(cohete);
}
}}

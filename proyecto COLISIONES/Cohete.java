import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cohete here.
 * 
 * @author Grupo Colision 
 *
 */
public class Cohete extends Actor
{
    /**
     * Comandos del teclado para dirigir el cohete......
     */
    public void act() 
    {
        move(3);
        if(Greenfoot.isKeyDown("left"))
{
            turn(-3);     
} 
        if(Greenfoot.isKeyDown("right"))
{
    turn(3);
}
if(Greenfoot.isKeyDown("up"))
{
    move(2);
}
if(Greenfoot.isKeyDown("down"))
{
    move(-2);
}

Actor marciano;
marciano= getOneObjectAtOffset(0, 0, Marciano.class) ;
if (marciano !=null)
{
    World world;
    world = getWorld();
    world.removeObject(marciano);
}
}}

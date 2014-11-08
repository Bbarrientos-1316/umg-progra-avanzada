import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ForceArrows here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForceArrow extends Actor
{
     private GreenfootImage image; 
    
    public ForceArrow()
    {
        this (150, 150);
    }
    
    public ForceArrow(int difX, int difY)
    {
        image = getImage();
        setImage(difX, difY);
    }
    
    public void setImage(int difX, int difY)
    {
        int direction = (int) Math.toDegrees(Math.atan2(difX, difY));  // Calculo del angulo de disparo.
        int length = (int) Math.sqrt(difX*difX+difY*difY) + 30;  //Calculo de la distancia

        GreenfootImage img = new GreenfootImage(image);
        img.scale(length*2, 300);
        setRotation(-direction-90);  //El angulo se da neg. debido a que el el -y es el norte.
        setImage(img);
    }    
}

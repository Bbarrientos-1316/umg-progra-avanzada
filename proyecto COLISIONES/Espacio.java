import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Espacio here.
 * 
 * @author (Grupo Colisiones) 
 *
 */
public class Espacio extends World
{

    /**
     * Constructor for objects of class Espacio.
     * 
     */
    public Espacio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        prepare();
    }

    /**
     **/
    private void prepare()
    {
        Marciano marciano = new Marciano();
        addObject(marciano, 663, 93);
        Marciano marciano2 = new Marciano();
        addObject(marciano2, 364, 113);
        Cohete rocket = new Cohete();
        addObject(rocket, 199, 452);
        Marciano marciano3 = new Marciano();
        addObject(marciano3, 685, 477);
        Marciano marciano4 = new Marciano();
        addObject(marciano4, 583, 539);
      Marciano marciano5 = new Marciano();
        addObject(marciano5, 598, 367);
        Marciano marciano6 = new Marciano();
        addObject(marciano6, 295, 448);
        Marciano marciano7 = new Marciano();
        addObject(marciano7, 147, 159);
       Marciano marciano8 = new Marciano();
        addObject(marciano8, 542, 54);
        Bomba bomba = new Bomba();
        addObject(bomba, 113, 118);
        Bomba bomba2 = new Bomba();
        addObject(bomba2, 396, 230);
        Bomba bomba3 = new Bomba();
        addObject(bomba3, 596, 330);
        
    }
    
  }
  
 



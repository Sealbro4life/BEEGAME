import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Actor
{
    int exactDirection;
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public Pizza(boolean direction)
    {
       getImage().scale(20,20);
       if (direction == true) {
           exactDirection = 180;
        }
        else {
            exactDirection = 0;
        }
       //if (direction == true)
       //{
       //setRotation(180);
    //}
    //else
    //{
      // setRotation(0); 
    //}
    }
    public void act()
    {
        Bewegen();
        abortus();
    }

    public void Bewegen()
    {
           move(16);
           setRotation(exactDirection);
        }
   
    public void abortus()
    {
        if(getX() >= getWorld().getWidth()-1)
          getWorld().removeObject(this); // als de bananen de zijkant van de wereld aanraken, zijn ze gone
        else  if(getX() < 1)
          getWorld().removeObject(this); // zelfde als 2 zinnen erboven
        else  if(getY() >= getWorld().getHeight()-1)
          getWorld().removeObject(this);
        else  if(getY() < 1)                   // als hij op de grond komt zal hij ook verdwijnen
          getWorld().removeObject(this);       
        else if (isTouching(grond.class))  // als het de grond aanraakt zal hij ook verdwijnen
        getWorld().removeObject(this);
    }
}

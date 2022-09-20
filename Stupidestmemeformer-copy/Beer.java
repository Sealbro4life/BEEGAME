import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Beer extends Enemy
{
    /**
     * Act - do whatever the Beer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
{
        count++;
        Bewegen();
        neergeschotenPizza(this);
}
    public void Bewegen()
    {
        if(count < 60)
        setLocation(getX() + speed, getY());
        else {
        speed = - speed;
        getImage().mirrorHorizontally();
        count = 0;
    }
    }
}


import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deadland here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deadland extends World
{

    /**
     * Constructor for objects of class Deadland.
     * 
     */
    public Deadland()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
    }
        public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
        Greenfoot.setWorld(new MyWorld()); // als je hier klikt wordt je weer terug naar MYworld geplaatst en the can begin.
    }
}
}

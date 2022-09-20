import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

    /**
     * Act - do whatever the Spawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
//spawnt enemies
public class spawn extends Actor
{
    int nummer; //
    int tijd = 55*1;  //
    public void act()
    {
        if (tijd == 0) // deze spawner is in essentie een zandloper
        {
        nummer = Greenfoot.getRandomNumber(100);
        tijd = 55*1;   // dit staat voor ongeveer 1x per minuut, dat java greenfoot een nummer kiest
    }
        if(nummer >= 78) // zoals thou seesth if thou numbeth equals larger or even equal them sizeth is thest chancheth 22 (als het nummer groter is dan 78, dan wordt er een 22% kans op spawning 
        {
        getWorld().addObject(new Bee(),getX(),getY());
        nummer = 0;
        tijd = 55*2; // als er gswamd kan worden dan worden er in 1 minutt tijd 2 bijen gespawnd
    } 
    tijd--;
}
}

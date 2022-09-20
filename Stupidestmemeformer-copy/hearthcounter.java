import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hearthcounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hearthcounter extends Actor
{
    /**
     * Act - do whatever the hearthcounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int lives = 20; // dit is hetzelfde getal als de healthcounter van de plauer en gaat oook omlaag wanneer de player schade krijgt
    public void act() 
    {
       setImage(new GreenfootImage(lives + " lives", 25, Color.RED,new Color(0,0,0))); // graphics voor de healthabar
    }    
    public void damage()
    {
     lives--;   // als de player sterft, verdwijnt er 1 leven
    }
    public void lifeup()
    {
         lives++; // als de [player op een of andere manier een leven krijgt, dan leeft hij
    }
}

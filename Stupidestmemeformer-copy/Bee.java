import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Enemy
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        eindeWereld();
        move(4);
        neergeschotenPizza(this);
        
    } 
     public void eindeWereld()
 {
     int x = getX();// minder typewerk
     int y = getY();// 
     int WorldWidth = getWorld().getWidth()-1; //
     int WorldHeight = getWorld().getHeight()-1;// dit krijgt de breedte van de wereld en de hoogte,bespaart echt onwijs veel typwerk, beetje spijt dat ik dit niet overal heb gedaan
     if (x >= WorldWidth)           // deze vier blokken met code zorgen er voor dat de enemy class niet buiten de map kan gaan, oftewel ze teleporteren naar de andere kant als ze de muur aanraken, ik heb de turn erbij gemaakt, om de bijen levendiger te lijken en het spel 3x zo moeilijk te maken :)
     {
         setLocation(1,y);
         turn(7);          
        
     }
     if (x<= 0)
     {
         setLocation(-1 ,y);
         turn(7);
     }
      if (y >= WorldHeight)
     {
         setLocation(x, 1);
         turn(7);
     }
     if (y <= 0 )
     {
         setLocation(x, WorldHeight -1);
        turn(-7);
     }
    } 
}

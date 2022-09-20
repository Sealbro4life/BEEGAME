import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = -3; // gewoon de snelheid, die alleen door de beerclass gebruiktwordt.
    int count = 0; // de seconden die geteld worden totdat de beer van locatie beweegd
    int health =2; // de hp van alle enemies 
    boolean shotPizza = false; // als d pizza niet geschoten is is hij ook daadwerkelijk niet geschoten. Dit was om mijn spel te repareren, want als je een enemy neerschoot crashte hij en kreeg ik de foutmelding, dat de game de locatie van een enemy wilde weten, dat er niet was.
    public void act()
    {
        //neergeschoten();
        //neergeschotenPizza();
    }
public void neergeschotenPizza(Actor enemy)
{
        Actor Pizza = getOneIntersectingObject(Pizza.class);  // dit zegt dat de pizza aanraking heeft met de enemy
        if(Pizza != null && ! shotPizza)
        {
            health--;                     // er gaat 1hp van de enemy.class er van af
            shotPizza = true;
            getWorld().removeObject(Pizza); // pizzas worden verwijdert
        }
        else if(!isTouching(Pizza.class))
        {
            shotPizza = false;  
        }
        if(health <= 0) // in het geval dat de enemy dood gaat, zal de pizza zelf ook moeten sterven
        {
        getWorld().removeObject(enemy);   
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int vSpeed = 0; // de verticale snelheid, is de snelheid waarmee je valt
    int accel = 1; // de versnellingsfactor voor de zwaartekracht. Dit zorgt ervoor dat je sneller valt
    int speed = 5; // sneleheid van de player
    int lives = 20;
    private int JumpHeight= -20; // zorgt ervoor hoe hoog de player kan springen
    public hearthcounter hp;
    int timerPizza;
    public void act()
    {
        checkVallen(); 
        Bewegen();
        vuurPizza();
        nextLevel();
                if(timerPizza > 0)
        {
            timerPizza--; // mijn pizza code was kapot en hiermee deed hij het, dit zorgde ervoor dat de pizzas van de wereld verdeenen nadat greenfoot zijn locatie wilde weten.
        }
        die();
    }
    public void die()
    {
       if(isTouching(Enemy.class) && lives != 0 || getY() >= getWorld().getHeight()-1 && lives != 0)
       {
           setLocation(217,70);
           lives--;
           hp.damage();          // dit is gewoon de standaard code, waarmee de player de enemy aanraakt, een leven verliest en daarna respwand op een locatie.
        }
        else if (lives == 0)
        {
            Greenfoot.setWorld(new Deadland()); // gewoon game_over
        }
    }    
    public void nextLevel()
    {
        if(isTouching(Deur.class))
        {
            Greenfoot.setWorld(new Level2()); // level 2
        }
                if(isTouching(cooleDeur.class))
        {
            Greenfoot.setWorld(new Heaven()); // win_screen
        }

    }
    
    
    public void vuurPizza() // de snelheid waarmee de pizzas geschoten
    {
        if(Greenfoot.isKeyDown("Z") && timerPizza == 0)
        {
            getWorld().addObject(new Pizza(true), getX()-40, getY()); // hierdoor lijkt het of de pizza vanuit de gun geschoten wordt terwijl dat niet het geval is
            timerPizza = 12; 
            
        }
        if(Greenfoot.isKeyDown("X") && timerPizza == 0)
        {
           getWorld().addObject(new Pizza(false), getX()+40, getY()); // zelfde als boven
           timerPizza = 12;
        }
    }
    public void vallen()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + accel; // hoe meer je valt des te sneller je valt
    }
    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, grond.class);
        return under != null; // hoerdoor kan je op een blokje staan en niet direct op plakken
    }
    public void checkVallen() // als je niet valt val je niet
    {
        if (onGround()== false)
        {
            vallen();
        }
        if (onGround() == true)
        {
            vSpeed = -1;
        }
}
 
        
     {              
    }
    public void Bewegen()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY()); // gewwon rechts bewegen
            
        }
        if(Greenfoot.isKeyDown("left"))

        {
            setLocation(getX() - speed, getY()); // snelheid waarmee de player raar links gaat
            
        }
        if(Greenfoot.isKeyDown("space")&&(onGround()==true))
        {
            vSpeed = JumpHeight; // als je spring moet je ook valle, anders zweef je
            vallen();
    }
 
    }
}



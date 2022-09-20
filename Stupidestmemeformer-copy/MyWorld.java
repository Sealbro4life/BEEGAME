import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1250, 900, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        grondklein grondklein = new grondklein();
        addObject(grondklein,95,723);
        grondklein.setLocation(658,266);
        grondklein grondklein2 = new grondklein();
        addObject(grondklein2,139,317);
        grondgroot grondgroot = new grondgroot();
        addObject(grondgroot,131,217);
        grondklein2.setLocation(378,288);
        grondklein.setLocation(503,197);
        grondklein grondklein3 = new grondklein();
        addObject(grondklein3,670,302);
        grondgroot grondgroot2 = new grondgroot();
        addObject(grondgroot2,941,163);
        grondgroot grondgroot3 = new grondgroot();
        addObject(grondgroot3,1120,414);
        grondklein grondklein4 = new grondklein();
        addObject(grondklein4,875,501);
        grondklein grondklein5 = new grondklein();
        addObject(grondklein5,664,513);
        grondklein grondklein6 = new grondklein();
        addObject(grondklein6,496,591);
        grondgroot grondgroot4 = new grondgroot();
        addObject(grondgroot4,155,575);
        grondgroot4.setLocation(190,572);
        grondgroot4.setLocation(160,590);
        grondklein6.setLocation(482,580);
        grondklein5.setLocation(656,505);
        grondklein4.setLocation(890,482);
        grondgroot grondgroot5 = new grondgroot();
        addObject(grondgroot5,263,845);
        grondgroot grondgroot6 = new grondgroot();
        addObject(grondgroot6,668,838);
        grondgroot grondgroot7 = new grondgroot();
        addObject(grondgroot7,1049,834);
        grondgroot7.setLocation(1059,822);
        grondgroot7.setLocation(1135,838);
        Player player = new Player();
        addObject(player,1142,772);
        Beer beer = new Beer();
        addObject(beer,774,781);
        Beer beer2 = new Beer();
        addObject(beer2,358,790);
        Beer beer3 = new Beer();
        addObject(beer3,259,533);
        Beer beer4 = new Beer();
        addObject(beer4,1202,356);
        player.setLocation(217,155);
        hearthcounter Hearthcounter = new hearthcounter(); // elke wereld deze code is allemaal voor de hearthcounter
        addObject(Hearthcounter,1136,46); // elke wereld 
        player.hp = Hearthcounter; // elke werels
        Deur deur = new Deur();
        addObject(deur,1160,767);
        grondgroot grondgroot8 = new grondgroot();
        addObject(grondgroot8,1035,838);
        grondgroot6.setLocation(737,853);
        beer.setLocation(730,825);
        grondgroot6.setLocation(607,884);
        Bee bee = new Bee();
        addObject(bee,369,214);
        Bee bee2 = new Bee();
        addObject(bee2,762,642);
    }
}

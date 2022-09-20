import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Player player = new Player();
        addObject(player,139,98);
        player.setLocation(139,78);
        hearthcounter Hearthcounter = new hearthcounter(); // elke wereld  voor de hearthcounter
        addObject(Hearthcounter,1136,46); // elke wereld hier ook
        player.hp = Hearthcounter; // elke wereld daar ook

        grondgroot grondgroot = new grondgroot();
        addObject(grondgroot,121,187);
        grondgroot grondgroot2 = new grondgroot();
        addObject(grondgroot2,738,185);
        grondklein grondklein = new grondklein();
        addObject(grondklein,808,604);
        grondklein.setLocation(940,412);
        grondgroot grondgroot3 = new grondgroot();
        addObject(grondgroot3,224,469);
        grondgroot grondgroot4 = new grondgroot();
        addObject(grondgroot4,559,659);
        grondklein.setLocation(814,616);
        grondklein grondklein2 = new grondklein();
        addObject(grondklein2,1088,512);
        grondgroot grondgroot5 = new grondgroot();
        addObject(grondgroot5,893,367);
        grondgroot2.setLocation(655,156);
        grondgroot5.setLocation(934,348);
        Beer beer = new Beer();
        addObject(beer,323,415);
        Beer beer2 = new Beer();
        addObject(beer2,662,604);
        Beer beer3 = new Beer();
        addObject(beer3,1008,279);
        spawn spawn = new spawn();
        addObject(spawn,1134,512);
        spawn spawn2 = new spawn();
        addObject(spawn2,595,378);
        spawn spawn3 = new spawn();
        addObject(spawn3,919,136);
        beer3.setLocation(992,228);
        grondgroot5.setLocation(961,265);
        beer3.setLocation(962,229);
        grondklein2.setLocation(1100,589);
        grondgroot5.setLocation(698,259);
        grondgroot5.setLocation(727,307);
        grondgroot5.setLocation(688,316);
        grondgroot5.setLocation(681,299);
        grondgroot5.setLocation(677,322);
        beer3.setLocation(742,300);
        beer3.setLocation(769,279);
        grondgroot2.setLocation(1150,161);
        spawn3.setLocation(885,125);
        grondklein2.setLocation(1083,493);
        grondklein grondklein3 = new grondklein();
        addObject(grondklein3,919,387);
        grondklein.setLocation(818,665);
        grondklein2.setLocation(1050,569);
        grondklein3.setLocation(926,358);
        grondklein.setLocation(881,664);
        spawn2.setLocation(613,282);
        spawn.setLocation(244,529);
        spawn2.setLocation(1027,301);
        spawn3.setLocation(731,93);
        spawn.setLocation(620,242);
        spawn2.setLocation(719,522);
        spawn.setLocation(628,206);
        removeObject(spawn3);
        grondklein grondklein4 = new grondklein();
        addObject(grondklein4,1012,228);
        grondklein4.setLocation(1016,227);
        cooleDeur cooleDeur = new cooleDeur();
        addObject(cooleDeur,1055,70); // om de player naar de volgende wereld te laten teleporteren
        cooleDeur.setLocation(1058,66);
        spawn spawn4 = new spawn();
        addObject(spawn4,30,407);
        Beer beer4 = new Beer();
        addObject(beer4,1149,512);
        removeObject(beer4);
        Bee bee = new Bee();
        addObject(bee,1116,439);
        Bee bee2 = new Bee();
        addObject(bee2,534,86);
        removeObject(bee2);
        removeObject(spawn);
    }
}

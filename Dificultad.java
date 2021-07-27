import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dificultad here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dificultad extends World {
    // private GreenfootSound music = new GreenfootSound("Fantasyland.mp3");

    public Dificultad() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(1280, 720, 1);
        // started();

        Dot hard = new Dot("dot.png", "stop_Dificultad", new Charge());
        addObject(hard, 643, 273);

        Dot return_1 = new Dot("return.png", "stop", new Inicio());
        addObject(return_1, 50, 50);

        //Dot ask = new Dot("question.png", "stop", new Ins());
        //addObject(ask, 1222, 670);

    }
    public void act() {
        if (Greenfoot.isKeyDown("a")) {
            // musicx.pause();
            Greenfoot.setWorld(new Ins());

        }
    }
    /*
     * public void started() { music.playLoop(); }
     * 
     * public void stopped() { music.stop(); }
     */
}

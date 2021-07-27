import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inicio here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Inicio extends World {

    /**
     * Constructor for objects of class Inicio.
     * 
     */

    // private GreenfootSound musicx = new GreenfootSound("Fantasyland.mp3");

    public Inicio() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        // musicx.setVolume(30);
        // musicx.playLoop();

    }

    public void act() {
        if (Greenfoot.isKeyDown("enter")) {
            // musicx.pause();
            Greenfoot.setWorld(new Dificultad());

        }
        if (Greenfoot.isKeyDown("z")) {

            Greenfoot.stop();
            // System.exit(1);
        }
    }

}

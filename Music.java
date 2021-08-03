import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class music here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Music extends Actor {
    /**
     * Act - do whatever the music wants to do. This method is called whenever the
     * 'Act' or 'Run' button gets pressed in the environment.
     */

    private GreenfootSound musicx = new GreenfootSound("Goat.mp3");

    public Music() {
        musicx.setVolume(50);
        musicx.playLoop();
    }

    public void Stop() {
        musicx.stop();
    }
}

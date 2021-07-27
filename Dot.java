import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dot here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dot extends Actor {
    /**
     * Act - do whatever the Dot wants to do. This method is called whenever the
     * 'Act' or 'Run' button gets pressed in the environment.
     */
    private String Stop;

    private World link;

    public Dot(String image, String stop, World link) {
        Stop = stop;
        setImage(new GreenfootImage(image));

        this.link = link;

    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            if (Stop == "stop_Dificultad") {
                ((Dificultad) getWorld()).stopped();
            }
            Greenfoot.setWorld(this.link);

        }
    }
}

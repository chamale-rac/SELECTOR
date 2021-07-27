import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Charge here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Charge extends World {

    /**
     * Constructor for objects of class Charge.
     * 
     */

    private TextCharge text;

    public Charge() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);

        this.text = new TextCharge("¡Preparate!\n\n(cargando   )\n");
        addObject(text, 660, 318);

        Time time = new Time(250, "Charge");

        addObject(time, 669, 330);

    }

}

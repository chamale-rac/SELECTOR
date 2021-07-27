import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ins extends World
{

    /**
     * Constructor for objects of class Ins.
     * 
     */
    public Ins()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        
        Dot return_2 = new Dot("return.png", "stop", new Dificultad());
        addObject(return_2, 50, 50);
    }
}

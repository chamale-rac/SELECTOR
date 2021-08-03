import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dificultad here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dificultad extends World {
    // private GreenfootSound music = new GreenfootSound("Fantasyland.mp3");
    ListOBJ lists;

    public Dificultad() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(1280, 720, 1);
        // started();musicx.setVolume(10);

        this.lists = new ListOBJ();
        addObject(lists, 1122, 140);

        Dot hard = new Dot("dot.png", "stop_Dificultad", new Charge());
        addObject(hard, 643, 273);

        Dot return_1 = new Dot("return.png", "init", new Vacio());
        addObject(return_1, 50, 50);

        Input User_pass = new Input("input.png");
        addObject(User_pass, 73, 656);

        // Dot ask = new Dot("question.png", "stop", new Ins());
        // addObject(ask, 1222, 670);

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

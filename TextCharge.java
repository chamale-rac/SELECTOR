import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextCharge here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class TextCharge extends Actor {

    Color TRANSPARENTE = new Color(0, 230, 0, 230);
    Color TRANSPARENTE2 = new Color(0, 0, 0, 150);
    String text;
    int x = 0;

    public TextCharge(String texto) {
        text = texto;

        setImage(new GreenfootImage(text, 60, TRANSPARENTE, TRANSPARENTE2));

    }

    public void Updatex(String texto) {
        text = texto;

        setImage(new GreenfootImage(text, 60, TRANSPARENTE, TRANSPARENTE2));
    }

    public void act() {
        x++;

        if (x == 0) {
            setImage(new GreenfootImage("¡Preparate!\n\n(cargando   )\n", 60, TRANSPARENTE, TRANSPARENTE2));
        }
        if (x == 20) {
            setImage(new GreenfootImage("¡Preparate!\n\n(cargando.  )\n", 60, TRANSPARENTE, TRANSPARENTE2));
        }
        if (x == 40) {
            setImage(new GreenfootImage("¡Preparate!\n\n(cargando.. )\n", 60, TRANSPARENTE, TRANSPARENTE2));

        }
        if (x == 60) {
            setImage(new GreenfootImage("¡Preparate!\n\n(cargando...)\n", 60, TRANSPARENTE, TRANSPARENTE2));
        }
        if (x == 80) {
            x = 0;
        }

    }

}

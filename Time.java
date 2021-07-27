import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Time here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Time extends Actor {
    /**
     * Act - do whatever the Time wants to do. This method is called whenever the
     * 'Act' or 'Run' button gets pressed in the environment.
     */

    int score, constant;
    int clicks_nice = 0;
    int resta = 0;
    String tipo;

    public Time(int Score, String Tipo) {
        tipo = Tipo;
        score = Score;
        constant = Score;
        setImage(new GreenfootImage(130, 100));
        GreenfootImage img = getImage();
        img.setFont(new Font("Helvetica", true, true, 60));
        img.setColor(Color.WHITE);
        img.drawString("[" + score / 10 + "]", 4, 60);
        // Dentro de 0 milisegundos avísame cada 1000 milisegundos

    }

    public void act() {
        if (score == 0) {
            if (tipo == "Game") {
                ((Game) getWorld()).stopped();
                ((Game) getWorld()).Finisher("¡Se acabó el tiempo!");
            }

            if (tipo == "Charge") {
                Greenfoot.setWorld(new Game());
            }
        } else {

            GreenfootImage img = getImage();
            img.clear();
            img.drawString("[" + score / 10 + "]", 4, 60);
            score--;
        }
    }

    public void ResetClock() {

        if (clicks_nice < 30) {
            clicks_nice++;
            resta = clicks_nice * 10;
        }
        score = constant - resta;
    }

    // Clase en la que está el código a ejecutar

    // Aquí se pone en marcha el timer cada segundo.

}

import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Score extends Actor {
    /**
     * Act - do whatever the Score wants to do. This method is called whenever the
     * 'Act' or 'Run' button gets pressed in the environment.
     */

    private int score;
    private Color TRANSPARENTE = new Color(0, 0, 0, 0);

    public Score() {
        score = 0;
        setImage(new GreenfootImage(200, 35));
        GreenfootImage img = getImage();
        img.setFont(new Font("Helvetica", true, true, 30));
        img.setColor(Color.WHITE);

        update();

    }

    public void addScore() {
        score++;
        update();
    }

    private void update() {
        GreenfootImage img = getImage();
        img.clear();
        img.drawString("SCORE:" + score, 4, 30);
    }

    public int getScore() {
        return score;
    }
}

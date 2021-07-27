import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buble here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buble extends Actor {
    /**
     * Act - do whatever the Buble wants to do. This method is called whenever the
     * 'Act' or 'Run' button gets pressed in the environment.
     */
    private Score score_internal;
    private String img_g, img_n;
    int x = 200;
    int randomNumber_move = getRandomNumber(1, 10);

    public void Updatex(String image_global, String image_name) {
        img_g = image_global;
        img_n = image_name;

        setImage(new GreenfootImage("animales/" + image_name + ".png"));
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 600, image.getHeight() - 600);
        setImage(image);

    }

    public Buble(Score score, String image_global, String image_name) {
        img_g = image_global;
        img_n = image_name;

        setImage(new GreenfootImage("animales/" + image_name + ".png"));

        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 600, image.getHeight() - 600);
        setImage(image);

        score_internal = score;

        int randomNumber = getRandomNumber(1, 180);
        turn(randomNumber);
    }

    static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void act() {
        x--;
        if (x == 0) {
            randomNumber_move = getRandomNumber(1, 10);
            x = 100;
        }
        move(randomNumber_move);

        if (atWorldEdge()) {
            int randomNumber = getRandomNumber(90, 270);
            turn(randomNumber);
        }

        if (Greenfoot.mouseClicked(this)) {
            if (img_g.equals(img_n)) {
                score_internal.addScore();
                ((Game) getWorld()).Updatex();
                ((Game) getWorld()).ResetClockMain();
            } else {
                ((Game) getWorld()).Finisher("¡Seleccionaste incorrectamente!");
            }

        }
    }

    public boolean atWorldEdge() {
        if (getX() < 10 || getX() > getWorld().getWidth() - 10) {
            return true;
        }
        if (getY() < 10 || getY() > getWorld().getHeight() - 10) {
            return true;
        } else {
            return false;
        }
    }

}

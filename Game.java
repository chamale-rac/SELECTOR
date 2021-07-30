import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.FileNotFoundException;

import java.io.File;
import java.util.Scanner;
import java.util.*;

import java.util.Arrays;
import java.util.Random;

/**
 * Write a description of class Game here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game extends World {
    // private GreenfootSound music = new GreenfootSound("Goat.mp3");
    private List<String> list_game = new ArrayList<String>();
    private int size;

    private Buble b1, b2, b3, b4;
    private Text text;

    Score score = new Score();
    Time time = new Time(500, "Game");

    static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public Game() {

        super(1280, 720, 1);
            // started();
    
            addObject(score, 120, 45);
            addObject(time, 672, 415);
        Adding();

    }

    public void Adding() {

        list_game = ReturngetLS();
        size = list_game.size();

        Collections.shuffle(list_game);
        String image = list_game.get(0);

        List<String> list_of3 = new ArrayList<String>();
        list_of3.add(image);
        list_of3.add(list_game.get(1));
        list_of3.add(list_game.get(2));
        list_of3.add(list_game.get(3));

        Collections.shuffle(list_of3);

        this.text = new Text(image);
        addObject(text, 669, 330);

        this.b1 = new Buble(score, image, list_of3.get(0));
        addObject(b1, 667, 175);

        this.b2 = new Buble(score, image, list_of3.get(1));
        addObject(b2, 422, 336);

        this.b3 = new Buble(score, image, list_of3.get(2));
        addObject(b3, 924, 333);

        this.b4 = new Buble(score, image, list_of3.get(3));
        addObject(b4, 680, 458);

    }

    public void Updatex() {
        list_game = ReturngetLS();
        size = list_game.size();

        Collections.shuffle(list_game);
        String image = list_game.get(0);

        List<String> list_of3 = new ArrayList<String>();
        list_of3.add(image);
        list_of3.add(list_game.get(1));
        list_of3.add(list_game.get(2));
        list_of3.add(list_game.get(3));

        Collections.shuffle(list_of3);

        text.Updatex(image);
        b1.Updatex(image, list_of3.get(0));
        b2.Updatex(image, list_of3.get(1));
        b3.Updatex(image, list_of3.get(2));

        b4.Updatex(image, list_of3.get(3));
    }

    public List<String> ReturngetLS() {
        // pass the path to the file as a parameter
        List<String> list = new ArrayList<String>();

        try {
            File file = new File("animales.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {

                String line = sc.nextLine();
                list.add(line);

            }

            return list;
        }

        catch (FileNotFoundException e) {
            System.out.println(e);
        }

        // Collections.shuffle(list);

        // int size = list.size();
        return list;
    }

    public void ResetClockMain() {
        time.ResetClock();
    }

    public void Finisher(String razon) {
        // score.getScore();
        Greenfoot.setWorld(new FinishScreen(score.getScore(), razon));
    }
    
    
    public void act() {
        if (Greenfoot.isKeyDown("z")) {
            // musicx.pause();
            Finisher("Te has retirado...");

        }
    }
    /*
     * public void started() { music.playLoop(); }
     * 
     * public void stopped() { music.stop(); }
     */
}

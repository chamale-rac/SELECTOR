import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;

/**
 * Write a description of class FinishScreen here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class FinishScreen extends World {

    /**
     * Constructor for objects of class FinishScreen.
     * 
     */

    private Text text;

    public FinishScreen(int Score, String razon) {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        GreenfootImage bg = new GreenfootImage("game.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);

        this.text = new Text(razon + "\n\nTu puntaje fue: \n" + Score);
        addObject(text, 669, 330);

        Dot return_1 = new Dot("return.png", "recharge", new Dificultad());
        addObject(return_1, 50, 50);

        Dot replay = new Dot("replay.png", "stop", new Charge());
        addObject(replay, 1216, 57);

        Save saver = new Save("save.png", Score);
        addObject(saver, 669, 510);

    }

    public void NoING() {
        JOptionPane.showMessageDialog(new JInternalFrame(), "Error, credenciales incorrectas", "Negativo",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void SiING() {
        JOptionPane.showMessageDialog(new JInternalFrame(), "Dato guardado, credenciales correctas", "Positivo",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

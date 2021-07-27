import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Text extends Actor {

  Color TRANSPARENTE = new Color(0, 230, 0, 230);
  Color TRANSPARENTE2 = new Color(0, 0, 0, 150);
  String text;

  public Text(String texto) {
    text = texto;

    setImage(new GreenfootImage(text, 60, TRANSPARENTE, TRANSPARENTE2));
    String txt = texto;
    int length = txt.length();
    if (length < 15) {
      Greenfoot.playSound("animales/" + txt + ".mp3");
    }
  }

  public void Updatex(String texto) {
    text = texto;

    setImage(new GreenfootImage(text, 60, TRANSPARENTE, TRANSPARENTE2));
    String txt = texto;
    int length = txt.length();
    if (length < 15) {
      Greenfoot.playSound("animales/" + txt + ".mp3");
    }

  }
}

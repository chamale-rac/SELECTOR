import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


import java.io.File;
import java.util.Scanner;
import java.util.*;

/**
 * Write a description of class Input here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Input extends Actor {
    /**
     * Act - do whatever the Input wants to do. This method is called whenever the
     * 'Act' or 'Run' button gets pressed in the environment.
     */
    String Name, Pass;
    Boolean Canceled = false;

    public Input(String image) {
        setImage(new GreenfootImage(image));

    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            String NameinputValues = JOptionPane.showInputDialog("Cree un nombre de usuario");
            Name = NameinputValues;


            if (Name == null) {
                Canceled = true;
            } else {
                String PassinputValues = JOptionPane.showInputDialog("Cree una contraseña");
                Pass = PassinputValues;
                if (Pass == null) {
                    Canceled = true;
                }
            }

            if (Canceled == false) {
                Insert(Name, Pass);
            }

        }

    }

    public void Insert(String name, String pass) {
        try (FileWriter f = new FileWriter("usuarios.txt", true);
                BufferedWriter b = new BufferedWriter(f);
                PrintWriter p = new PrintWriter(b);) {
            p.println(name+","+pass+",0");
        } catch (IOException i) {
            i.printStackTrace();
        }
        
        

    }
    
}

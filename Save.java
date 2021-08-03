import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.io.File;
import java.util.Scanner;
import java.util.*;

import java.lang.Object;

import java.io.FileNotFoundException;

import java.io.File;
import java.util.Scanner;
import java.util.*;

import java.util.Arrays;
import java.util.Random;

/**
 * Write a description of class Save here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Save extends Actor {
    /**
     * Act - do whatever the Save wants to do. This method is called whenever the
     * 'Act' or 'Run' button gets pressed in the environment.
     */
    String Name, Pass;
    Boolean Canceled = false;
    int score_int;

    public Save(String image, int score_ext) {
        setImage(new GreenfootImage(image));
        score_int = score_ext;

    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            String NameinputValues = JOptionPane.showInputDialog("Ingrese un nombre de usuario (existente)");
            Name = NameinputValues;

            if (Name == null) {
                Canceled = true;
            } else {
                String PassinputValues = JOptionPane.showInputDialog("Ingrese su contraseña");
                Pass = PassinputValues;
                if (Pass == null) {
                    Canceled = true;
                }
            }

            if (Canceled == false) {
                Search(Name, Pass, score_int);
            }

        }

    }

    public void Search(String name, String pass, int ss) {
        List<String> list = new ArrayList<String>();

        ArrayList<ArrayList<String>> x = new ArrayList<ArrayList<String>>();

        try {
            File file = new File("usuarios.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {

                String line = sc.nextLine();
                list.add(line);

            }

            // FOR ORDER
            int len = list.size();

            // System.out.println(len);
            int allgo = 0;

            String man;

            for (int i = 0; i < len; i++) {
                man = list.get(i);
                String[] partes = man.split(",");

                String p0 = partes[0];
                String p1 = partes[1];
                String p2 = partes[2];

                x.add(new ArrayList<String>(Arrays.asList(p0, p1, p2)));
            }

            // System.out.println(x);
            Boolean guardado = false;
            for (int i = 0; i < len; i++) {

                if ((name.equals(x.get(i).get(0))) && (pass.equals(x.get(i).get(1)))) {

                    x.set(i, new ArrayList<String>(Arrays.asList(name, pass, Integer.toString(ss))));
                    guardado = true;
                    // System.out.println("pepa");
                    // System.out.println(x.get(i));
                }

            }
            String texto = "";

            for (int i = 0; i < len; i++) {
                String item0 = String.join(",", x.get(i));
                if ((i + 1) == len) {
                    texto = texto + item0;
                } else {
                    texto = texto + item0 + "\n";
                }
            }

            try (FileWriter f = new FileWriter("usuarios.txt", false);
                    BufferedWriter b = new BufferedWriter(f);
                    PrintWriter p = new PrintWriter(b);) {
                p.println(texto);
            } catch (IOException i) {
                i.printStackTrace();
            }

            // System.out.println(x);
            // System.out.println(guardado);

            if (guardado == false) {
                ((FinishScreen) getWorld()).NoING();
            }
            if (guardado == true) {
                ((FinishScreen) getWorld()).SiING();
            }
        }

        catch (FileNotFoundException e) {
            System.out.println(e);
        }

        // Collections.shuffle(list);

        // int size = list.size();

    }

}

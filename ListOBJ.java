import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Object;

import java.io.FileNotFoundException;

import java.io.File;
import java.util.Scanner;
import java.util.*;

import java.util.Arrays;
import java.util.Random;
/**
 * Write a description of class List here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListOBJ extends Actor
{
    /**
     * Act - do whatever the List wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Color TRANSPARENTE = new Color(0, 230, 0, 230);
    Color TRANSPARENTE2 = new Color(0, 0, 0, 150);
    private ArrayList<ArrayList<String> > list_OBJ = new ArrayList<ArrayList<String> >();
    int contador = 0;
    
    public ListOBJ()
    {
        list_OBJ = ReturngetLS(); 
        String texto = "Mejores 3 Resultados:\n\nusuario-score\n";
        
        for (int i = 0; i < 3; i++) 
        {
            String item0 = String.join(" - ",list_OBJ.get(i));
            texto = texto +"\n" + item0;
        }
        String item0 = String.join("-",list_OBJ.get(0));
        String item2 = String.join("-",list_OBJ.get(0));
        String item3 = String.join("-",list_OBJ.get(0));
        String item4 = String.join("-",list_OBJ.get(0));
        setImage(new GreenfootImage(texto, 30, TRANSPARENTE, TRANSPARENTE2));
           
        
    }
       
    public void run()
    {
        
        
        list_OBJ = ReturngetLS(); 
        String texto = "Mejores 3 Resultados:\n\nusuario-score\n";
        
        for (int i = 0; i < 3; i++) 
        {
            String item0 = String.join(" - ",list_OBJ.get(i));
            texto = texto +"\n" + item0;
        }
        String item0 = String.join("-",list_OBJ.get(0));
        String item2 = String.join("-",list_OBJ.get(0));
        String item3 = String.join("-",list_OBJ.get(0));
        String item4 = String.join("-",list_OBJ.get(0));
        setImage(new GreenfootImage(texto, 30, TRANSPARENTE, TRANSPARENTE2));
        contador = 0;
    
        
      
        // Add your action code here.
    }
    
    public ArrayList<ArrayList<String> > ReturngetLS() {
        // pass the path to the file as a parameter
        List<String> list = new ArrayList<String>();
        
            ArrayList<ArrayList<String> > x
                = new ArrayList<ArrayList<String> >();
        
        try {
            File file = new File("usuarios.txt");
            Scanner sc = new Scanner(file);
            

            while (sc.hasNextLine()) {

                String line = sc.nextLine();
                list.add(line);

            }
            
            //FOR ORDER
            int len = list.size();
            
            System.out.println(len);
            int allgo = 0;
            
            String man;
            
            
            for (int i = 0; i < len; i++)
            {
                man = list.get(i);
                String[] partes = man.split(",");
                
                String p0 = partes[0];
                String p2 = partes[2];
                
                x.add(new ArrayList<String>(
                Arrays.asList(p0, p2)));
            }
            
            System.out.println(x);
            
            for (int i = 0; i < len; i++)
            {
                for (int e = 0; e < len; e++)
                {
                    if(Integer.parseInt(x.get(i).get(1)) > Integer.parseInt(x.get(e).get(1)))
                    {
                        ArrayList<String> ix = x.get(i);
                        ArrayList<String> ex = x.get(e);
                        
                        x.set(i,ex);
                        x.set(e, ix);
                        
                        System.out.println(x);
                    }
                    
                }
            }
            
            System.out.println(x);

            return x;
        }

        catch (FileNotFoundException e) {
            System.out.println(e);
        }

        // Collections.shuffle(list);

        // int size = list.size();
        return x;
    }
}

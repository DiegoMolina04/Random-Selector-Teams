/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopunto2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author pc
 */
public class punto2 {
    public void cuartos() throws IOException{
        int random1 = 0;
        int random2 = 0;
        int k = 8;
       
        
        List<String> equipos = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader lector = new BufferedReader (isr);
        
        for(int d=0;d<=7;d++){
            System.out.println("_____________________________");
            System.out.println("Digite el nombre del equipo :");
            equipos.add(lector.readLine());
            
            
        }
        Random rnd = new Random();
        for (int r=0;r<=3;r++){
            random1 = rnd.nextInt(k);
            String equipo1 = equipos.get(random1);
            equipo1 = equipos.remove(random1);
            k = k-1;
            
        Random rnd2 = new Random();
        random2 = rnd2.nextInt(k);
        String equipo2 = equipos.get(random2);
        equipo2 = equipos.remove(random2);
        k = k-1;
            System.out.println(" "+equipo1+" "+"Contra"+" "+equipo2);            
                    
        }
        System.out.println("Asi quedan emparejados");
    }
    
}

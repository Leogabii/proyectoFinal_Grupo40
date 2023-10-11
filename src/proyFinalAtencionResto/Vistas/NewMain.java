/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyFinalAtencionResto.Vistas;

import java.time.LocalDateTime;

/**
 *
 * @author equipo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LocalDateTime locaDate = LocalDateTime.now();
int hours  = locaDate.getHour();
int minutes = locaDate.getMinute();
int seconds = locaDate.getSecond();
System.out.println("Hora actual : " + hours  + ":"+ minutes +":"+seconds); 
    }
    
}

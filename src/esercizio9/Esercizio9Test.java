/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio9;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Utente
 */
public class Esercizio9Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Camera uno = new Camera("matrimoniale", 101);
        ArrayList <Camera>camereLibere = new ArrayList<>();
        Albergo donadoni = new Albergo("donadoni");
        
        
        donadoni.addCamera(uno);
        donadoni.addCamera(new Camera("singola", 102));
        donadoni.addCamera(new Camera("singola", 103));
        donadoni.addCamera(new Camera("singola", 104));
        
        donadoni.addPrenotazione(new Prenotazione(null, null, "r", "t", uno));
        
        camereLibere = donadoni.ricercaCamereLibere();
        
        
                    
            System.out.println("Camere libere: ");

        for(int i = 0; i < camereLibere.size(); i++){
        
            System.out.println(camereLibere.get(i).getNumeroDiCamera());
        }
    }
    
}

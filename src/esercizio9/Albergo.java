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
public class Albergo {
    
    private String nome;
    private ArrayList <Camera> camere;
    private ArrayList <Prenotazione> listaPrenotazioni;

    public Albergo(String nome) {
        this.nome = nome;
        camere = new ArrayList<>();
        listaPrenotazioni = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addPrenotazione(Prenotazione p){
    
        listaPrenotazioni.add(p);
    }
    
    public boolean remRimozione(int codice){

        for(int i = 0; i < listaPrenotazioni.size(); i++){
        
            if(codice == listaPrenotazioni.get(i).getCodiceUnivoco()){
            
                listaPrenotazioni.remove(i);
                return true;
            }
        
        }
        return false;
    }
    
    public ArrayList <Camera> ricercaCamereLibere(){
    
        ArrayList <Camera> camereLibere = new ArrayList<>();
        
        for(int i = 0; i < camere.size(); i++){
        
            if(!camere.get(i).isOccupata()){
            
                camereLibere.add(camere.get(i));
            }
        }
        return camereLibere;
    }
    
    public void addCamera(Camera c){
    
        camere.add(c);
    }
    
    public boolean remCamera(int num){
    
        for(int i = 0; i < camere.size(); i++){
        
            if(camere.get(i).getNumeroDiCamera() == num){
            
                camere.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList <Prenotazione> ricercaPretazioniCertoGiorno(GregorianCalendar data){
    
        ArrayList <Prenotazione> listaPrenotazioniGiorno = new ArrayList<>();
        
        for(int i = 0; i < listaPrenotazioni.size(); i++){
        
            if(data == listaPrenotazioni.get(i).getDataArrivo()){
            
                listaPrenotazioniGiorno.add(listaPrenotazioni.get(i));
            }
        }
        return listaPrenotazioniGiorno;
    }
}

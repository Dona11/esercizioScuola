/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio9;

import java.util.GregorianCalendar;

/**
 *
 * @author Utente
 */
public class Prenotazione {
    
    private GregorianCalendar dataArrivo;
    private GregorianCalendar dataPartenza;
    private String nomeCliente;
    private String cognomeCliente;
    private Camera cameraPrenotazione;
    private int codiceUnivoco;
    private static int generaCodice = 1;

    public Prenotazione(GregorianCalendar dataArrivo, GregorianCalendar dataPartenza, String nomeCliente, String cognomeCliente, Camera cameraPrenotazione) {
        this.dataArrivo = dataArrivo;
        this.dataPartenza = dataPartenza;
        this.nomeCliente = nomeCliente;
        this.cognomeCliente = cognomeCliente;
        this.cameraPrenotazione = cameraPrenotazione;
        this.codiceUnivoco = generaCodice++;
        
    }

    public GregorianCalendar getDataArrivo() {
        return dataArrivo;
    }

    public void setDataArrivo(GregorianCalendar dataArrivo) {
        this.dataArrivo = dataArrivo;
    }

    public GregorianCalendar getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(GregorianCalendar dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCognomeCliente() {
        return cognomeCliente;
    }

    public void setCognomeCliente(String cognomeCliente) {
        this.cognomeCliente = cognomeCliente;
    }

    public Camera getCameraPrenotazione() {
        return cameraPrenotazione;
    }

    public void setCameraPrenotazione(Camera cameraPrenotazione) {
        this.cameraPrenotazione = cameraPrenotazione;
    }

    public int getCodiceUnivoco() {
        return codiceUnivoco;
    }
    
    
    
}

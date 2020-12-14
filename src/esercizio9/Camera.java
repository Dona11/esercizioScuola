/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio9;

/**
 *
 * @author Utente
 */
public class Camera {
    
    private int numeroDiCamera;
    private String tipologia;
    private boolean occupata;

    public int getNumeroDiCamera() {
        return numeroDiCamera;
    }

    public void setNumeroDiCamera(int numeroDiCamera) {
        this.numeroDiCamera = numeroDiCamera;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public boolean isOccupata() {
        return occupata;
    }

    public void setOccupata(boolean occupata) {
        this.occupata = occupata;
    }

    public Camera(String tipologia, int numeroDiCamera) {
        this.tipologia = tipologia;
        this.numeroDiCamera = numeroDiCamera;
        this.occupata = false;
    }
    
    
}

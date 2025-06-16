/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccion;

import embarcaciones.Barco;

/**
 *
 * @author Alberto
 */
public class Flota {

    private int aleatorio = (int) (Math.random() * 11 + 10);
    private Barco[] flota = new Barco[aleatorio];
    private int posInsertar = 0;

    public int numeroElementos() {
        int numero = 0;
        for (Barco b : flota) {
            if (b != null) {
                numero++;
            }
        }
        return numero;
    }

    public boolean insertarBarco(Barco b) {

        for (Barco barco : flota) {
            if (b.equals(barco)) {
                return false;
            }
        }

        if (posInsertar < flota.length) {
            flota[posInsertar] = b;
            posInsertar++;
            return true;
        } else {
            return false;
        }

    }

    public boolean eliminarBarco(Barco b) {
        for (int i = 0; i < flota.length; i++) {
            if (flota[i] != null && flota[i].equals(b)) {
                flota[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public Barco[ ] arrayBarcos(){
        return flota;
    }

}

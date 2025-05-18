/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercito;

import Personajes.Personaje;
import Personajes.Mago;
import Personajes.Guerrero;
import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Alberto
 */
public class Ejercito {

    private static int codigo;
    private Personaje[] ejercito;
    HashSet posOcupada = new HashSet<>();
    Personaje personaje;

    public Ejercito() {
        ++codigo;
        int cantidadPersonajes = (int) (Math.random() * 4.0 + 3.0);
        this.ejercito = new Personaje[cantidadPersonajes];
        int cont = 0;

        for (int i = 0; i < cantidadPersonajes; ++i) {
            int asignarPersonaje = (int) (Math.random() * 2.0);
            if (asignarPersonaje == 0) {
                this.ejercito[cont++] = new Guerrero();
            } else {
                this.ejercito[cont++] = new Mago();
            }
        }

        int pos;
        do {
            pos = (int) (Math.random() * 21 + 1);

        } while (posOcupada.contains(pos));
        posOcupada.add(pos);
        personaje.setPosicion(pos);

    }

    public int tamanyoEjercito() {
        return this.ejercito.length;
    }

    public void realizarAtaque(Ejercito enemigo) {
        for (int i = 0; i < this.ejercito.length; ++i) {
            int enemigoAleatorio = (int) (Math.random() * (double) enemigo.tamanyoEjercito());
            System.out.println(this.ejercito);
            enemigo.obtenerPersonaje(enemigoAleatorio).recibirAtaque(this.ejercito[i].getFuerza());
            System.out.println("El enemigo " + enemigoAleatorio + " ha recibido un ataque de " + this.ejercito[i].getFuerza() + " de fuerza");
        }

    }

    public void eliminarPersonaje(int pos) {
        this.ejercito[pos] = null;
    }

    public boolean ejercitoDerrotado() {
        return this.ejercito[0] == null;
    }

    public Personaje obtenerPersonaje(int pos) {
        return this.ejercito[pos];
    }

    public void moverPersonaje(Personaje personaje) {
    }

    public String toString() {
        int var10000 = codigo;
        return "EJERCITO: " + var10000 + " componentes\n" + Arrays.toString(this.ejercito);
    }
}

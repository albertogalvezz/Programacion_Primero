/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @author Alberto
 */
import java.util.Random;

public abstract class Personaje {
    private static int codigo;
    private int vida;
    private int posicion;
    private int alcance;
    private int movimiento;
    private int fuerza;

    public Personaje(int vida, int alcance, int movimiento, int fuerza) {
        Random num = new Random();
        ++codigo;
        this.vida = vida;
        this.alcance = alcance;
        this.movimiento = movimiento;
        this.fuerza = fuerza;
    }

    public int simularAtaque() {
        return this.getFuerza();
    }

    public void recibirAtaque(int puntos) {
        this.vida -= puntos;
        if (this.vida < 0) {
            this.vida = 0;
            System.out.println("El personaje con código: " + codigo + " ha muerto...");
        }

    }

    public static int getCodigo() {
        return codigo;
    }

    public static void setCodigo(int codigo) {
        Personaje.codigo = codigo;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPosicion() {
        return this.posicion;
    }

    public void setPosicion(int posicion) {
        if (posicion > 0 && posicion < 21) {
            this.posicion = posicion;
        }else{
            System.out.println("La posicion debe comprender el rango de 1-20");
        }
    }

    public int getAlcance() {
        return this.alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getMovimiento() {
        return this.movimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public int getFuerza() {
        return this.fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}

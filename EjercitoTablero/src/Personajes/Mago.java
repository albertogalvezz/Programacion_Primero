/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @author Alberto
 */
public class Mago extends Personaje {
    private String codigo = "M" + getCodigo();
    private int magia = 50;

    public Mago() {
        super(10, 5, 3, 3);
    }

    public String toString() {
        String var10000 = this.codigo;
        return "-Mago-\nCódigo: " + var10000 + "\nNivel de vida: " + this.getVida() + "\nPosición: " + this.getPosicion() + "\nAlcance de ataque: " + this.getAlcance() + "\nRango de movimiento: " + this.getMovimiento() + "\nFuerza: " + this.getFuerza() + "\nNivel de magia: " + this.magia + "\n";
    }
}

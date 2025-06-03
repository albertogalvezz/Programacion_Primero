
package Personajes;

/**
 *
 * @author Alberto
 */

public class Guerrero extends Personaje {
    private String codigo = "G" + getCodigo();

    public Guerrero() {
        super(20, 1, 5, 5);
    }

    public String toString() {
        String var10000 = this.codigo;
        return "-Guerrero-\nCódigo: " + var10000 + "\nNivel de vida: " + this.getVida() + "\nPosición: " + this.getPosicion() + "\nAlcance de ataque: " + this.getAlcance() + "\nRango de movimiento: " + this.getMovimiento() + "\nFuerza: " + this.getFuerza() + "\n";
    }
}



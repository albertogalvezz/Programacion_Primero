
package ejercitotablero;

import Ejercito.Ejercito;
import Personajes.Personaje;
import java.util.Arrays;

/**
 *
 * @author Alberto
 */
public class Main {

    public static void main(String[] args) {
        Ejercito ejercito = new Ejercito();
        new Ejercito();
        Personaje[] personajes = new Personaje[20];

        for (int i = 0; i < personajes.length; ++i) {
            if (ejercito.tamanyoEjercito() <= i) {
                personajes[i] = ejercito.obtenerPersonaje(i);
            } else {
                personajes[i] = null;
            }
        }

        System.out.println(Arrays.toString(personajes));
    }
}

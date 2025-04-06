import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int cantidadNumeros = (int) (Math.random() * 11 + 10);
        int contador = 0;
        int contNumeros = 0;

        List<Integer> listaNumero = new ArrayList<>();
        Set<Integer> listaCopia = new LinkedHashSet<>();

        for (int i = 0; i < cantidadNumeros; i++) {
            int numeros = (int) (Math.random() * 26 + 1);
            listaNumero.add(numeros);
        }

        do {
            for (int i = 0; i < listaNumero.size(); i++) {
                if (listaNumero.get(contador) == listaNumero.get(i)) {
                    contNumeros++;
                }
            }

            if (contNumeros % 2 != 0) {
                listaCopia.add(listaNumero.get(contador));
            }

            contNumeros = 0;
            contador++;

        }while(contador < cantidadNumeros);

        System.out.println("Lista de números: " + listaNumero);
        System.out.println("Números con apariciones impares: " + listaCopia);
    }
}
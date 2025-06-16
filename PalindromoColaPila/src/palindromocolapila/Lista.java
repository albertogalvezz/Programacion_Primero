package palindromocolapila;

/**
 *
 * @author Alberto
 */
public class Lista<T> {

    private static final Object[] lista = new Object[30];
    private int cantidad = 0;

    public void insertarPorPosicion(T elemento, int pos) {
        if (!listaLlena()) {
            if (pos > cantidad) {
                pos = cantidad;
            }

            if (pos < cantidad) {
                System.arraycopy(lista, pos, lista, pos + 1, cantidad - pos);
            }

            lista[pos] = elemento;
            cantidad++;
        }
    }

    public T sacarPorPosicion(int pos) {

        T elemento = null;

        if (pos >= 0 && pos < cantidad) {
            elemento = (T) lista[pos];

            if (pos < cantidad - 1) {
                System.arraycopy(lista, pos + 1, lista, pos, cantidad - pos - 1);
            }

            lista[cantidad - 1] = null;

            cantidad--;
        }

        return elemento;
    }

    public boolean listaVacia() {
        if (lista.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean listaLlena() {
        if (lista.length != 0) {
            return true;
        } else {
            return false;
        }
    }

    public int tamano() {
        return lista.length;
    }

}

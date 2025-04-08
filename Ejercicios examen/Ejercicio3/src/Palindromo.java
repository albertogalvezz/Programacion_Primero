import java.util.ArrayList;
import java.util.List;

public class Palindromo<T> {

    private T[] lista;
    int numElementos;

    public Palindromo() {
        this.lista = (T[])new Object[30];
        this.numElementos = 0;
    }

    public void insertarPorPosicion(T elemento, int pos) {

        lista[pos] = elemento;
    }

    public T sacarPorPosicion(int pos) {
        if(lista[pos] == null){
            return null;
        }else {
            T objetoDevuelto = lista[pos];

            for (int i=0; i <this.numElementos - 1; i++) {
                lista[i] = lista[i+1];
            }
            this.numElementos--;

            return objetoDevuelto;
        }
    }

    public boolean listaVacia() {
        return this.numElementos == 0;
    }

    public boolean listaLlena() {
        return this.numElementos != 0;
    }

    public int tamano() {
        return this.numElementos;
    }
}

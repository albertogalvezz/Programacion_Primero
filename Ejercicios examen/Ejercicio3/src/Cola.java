public class Cola<T>{

    Pila pila = new Pila();

    public void encolar(T elemento) {
        pila.apilar(elemento);
    }

    public void desencolar() {
        pila.desapilar();
    }

    public boolean colaLlena() {
        return pila.colaLlena();
    }

    public boolean colaVacia() {
        return pila.colaVacia();
    }
}

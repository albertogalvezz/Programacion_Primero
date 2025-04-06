public class Horno<T> implements AccionesEstructuras<T>{

    String[] cola;
    int cont;

    public Horno(int longitudCola) {
        cola = new String[longitudCola];
        cont = 0;
    }

    @Override
    public boolean push(Object elemento) {

        if (cola.length < cont) {
            return false;

        }else{
            cola[cont++] = (String) elemento;
            return true;
        }
    }

    @Override
    public T pop() {
        T objetoDevuelto = (T) cola[0];

        for (int i=0; i <this.cont - 1; i++) {
            cola[i] = cola[i+1];
        }
        this.cont--;

        return objetoDevuelto;
    }

    @Override
    public boolean esVacia() {
        return this.cont == 0;
    }

    @Override
    public int getNumElementos() {
        return this.cont;
    }
}

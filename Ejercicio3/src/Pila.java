public class Pila<T> {

    Palindromo palindromo = new Palindromo();

    public void apilar(T elem){
        palindromo.insertarPorPosicion(elem, 0);
    }

    public void desapilar(){
        palindromo.sacarPorPosicion(0);

    }

    public boolean colaLlena(){
        return palindromo.listaLlena();
    }

    public boolean colaVacia(){
        return palindromo.listaVacia();
    }


}

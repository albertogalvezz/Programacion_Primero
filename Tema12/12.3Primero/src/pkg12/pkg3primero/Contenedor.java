/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12.pkg3primero;

import java.util.Arrays;

/**
 *
 * @author Alberto
 */
public class Contenedor<T> implements Pila<T> {

    private T tabla[];

    public Contenedor(T tabla[]) {
        this.tabla = tabla;
    }

    public void insertarAlPrincipio(T nuevo) {
        T nuevaTabla[] = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, nuevaTabla, 1, tabla.length);
        nuevaTabla[0] = nuevo;
        tabla = nuevaTabla;
    }

    public void insertarAlFinal(T nuevo) {
        T nuevaTabla[] = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, nuevaTabla, 0, tabla.length);
        nuevaTabla[tabla.length] = nuevo;
        tabla = nuevaTabla;
    }

    public T extraerDelPrincipio() {
        T resultado = tabla[0];
        T nuevaTabla[] = Arrays.copyOf(tabla, tabla.length - 1);
        System.arraycopy(tabla, 1, nuevaTabla, 0, tabla.length - 1);
        tabla = nuevaTabla;
        return resultado;
    }

    public T extraerDelFinal() {
        T resultado = tabla[tabla.length - 1];
        T nuevaTabla[] = Arrays.copyOf(tabla, tabla.length - 1);
        tabla = nuevaTabla;
        return resultado;
    }

    public void ordenar() {
        Arrays.sort(tabla);
    }

    @Override
    public String toString() {
        return Arrays.toString(tabla);
    }

    @Override
    public void apilar(T nuevo) {
        insertarAlPrincipio(nuevo);

    }

    @Override
    public T desapilar() {
        return extraerDelPrincipio();
    }

    public static void main(String[] args) {

        Integer lista[] = {1, 2, 3, 4, 5};
        Contenedor c = new Contenedor(lista);

        System.out.println(c + "\n");

        c.desapilar();
        c.desapilar();
        c.apilar(10);

        System.out.println(c);
    }

}

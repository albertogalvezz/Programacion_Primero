/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primero;

import java.util.Arrays;

/**
 *
 * @author Alberto
 */
public class Contenedor<T extends Comparable<T>> {

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
        return tabla[0];
    }

    public T extraerDelFinal() {
        T resultado = tabla[tabla.length - 1];
        T nuevaTabla[] = Arrays.copyOf(tabla, tabla.length - 1);
        tabla = nuevaTabla;
        return resultado;
    }
    
    public void ordenar(){
        Arrays.sort(tabla);
    }

    @Override
    public String toString() {
        return Arrays.toString(tabla);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12.pkg3primero;

import java.util.Arrays;
import java.util.Scanner;

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
        if (tabla.length == 0) {
            return null;
        }

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

        Pila<Integer> p = new Contenedor(new Integer[0]);
        Scanner sc = new Scanner(System.in);
        Integer resultado = 0;

        do {
            System.out.print("Introduce un número entero: ");
            resultado = sc.nextInt();

            if (resultado != -1) {
                p.apilar(resultado);
            }

        } while (resultado != -1);

        System.out.println("\n"+ "Desapilamos: ");
        Integer num = p.desapilar();

        while (num != null) {
            System.out.println(num + " ");
            num = p.desapilar();
        }
        System.out.println("");

    }

}

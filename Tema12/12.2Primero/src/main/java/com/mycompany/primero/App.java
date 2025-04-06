/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primero;

/**
 *
 * @author Alberto
 */
public class App {

    public static void main(String[] args) {
        Integer array[] = {1,2,3,4};
        Contenedor<Integer> c = new Contenedor(array);
        
        c.insertarAlPrincipio(7);
        c.insertarAlPrincipio(6);
        c.insertarAlFinal(10);
        c.insertarAlFinal(11);
        //c.ordenar();
        System.out.println(c.extraerDelFinal());
        
        System.out.println(c);
    }
}

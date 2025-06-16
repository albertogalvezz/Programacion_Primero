package barcos;

import coleccion.Flota;
import embarcaciones.Acorazado;
import embarcaciones.Submarino;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion, numCanyones;
        double longitud;

        Flota flota = new Flota();

        do {
            System.out.println("""
                               MENÚ
                               1. Insertar barco
                               2. Eliminar barco
                               3. Mostrar acorazados por orden de inserción
                               0. Salir
                               """);

            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Para introducir Acorazado pulsa 1, para introducir Submarino pulse 2: ");
                    opcion = sc.nextInt();

                    if (opcion == 1) {
                        System.out.print("Indica la longitud del Acorazado: ");
                        longitud = sc.nextInt();

                        System.out.print("Indica el número de cañones que tendrá el Acorazado: ");
                        numCanyones = sc.nextInt();

                        if (flota.insertarBarco(new Acorazado(longitud, numCanyones))) {
                            System.out.println("El Acorazado se ha insertado correctamente");
                        } else {
                            System.err.println("No se pudo insertar el Acorazado");
                        }

                    } else if (opcion == 2) {
                        System.out.print("Indica la longitud del Submarino: ");
                        longitud = sc.nextInt();

                        if (flota.insertarBarco(new Submarino(longitud))) {
                            System.out.println("El Submarino se ha insertado correctamente");
                        } else {
                            System.err.println("No se pudo insertar el Submarino");
                        }

                    } else {
                        System.out.println("La opción introducida no es válida.");
                    }
                }
                case 2 -> {
                    System.out.println("Introduce los datos del barco que quieras eliminar");
                    System.out.print("Para introducir Acorazado pulsa 1, para introducir Submarino pulse 2: ");
                    opcion = sc.nextInt();

                    if (opcion == 1) {
                        System.out.print("Indica la longitud del Acorazado: ");
                        longitud = sc.nextInt();

                        System.out.print("Indica el número de cañones que tendrá el Acorazado: ");
                        numCanyones = sc.nextInt();
                        
                        if (flota.eliminarBarco(new Acorazado(longitud, numCanyones))) {
                            System.out.println("Acorazado eliminado correctamente");
                        }else{
                            System.err.println("No se ha podido eliminar el acorasao");
                        }

                    } else if (opcion == 2) {
                        System.out.print("Indica la longitud del Submarino: ");
                        longitud = sc.nextInt();
                        
                        if (flota.eliminarBarco(new Submarino(longitud))) {
                            System.out.println("Submarino eliminado correctamente");
                        }else{
                            System.err.println("No se ha podido eliminar el subma");
                        }

                    } else {
                        System.out.println("La opción introducida no es válida.");
                    }
                }
                case 3 -> {
                    System.out.println(Arrays.toString(flota.arrayBarcos()));
                }
                default -> {
                }
            }
        } while (opcion != 0);
        System.out.println("El programa ha terminado.");
        
    }

}

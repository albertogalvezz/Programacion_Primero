package temperaturas;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class Temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperaturasMaximas t = new TemperaturasMaximas();
        int opcion;
        String mes, temperatura;

        do {
            System.out.println("""
                               
                           MENÚ
                           1. Introducir temperatura
                           2. Eliminar mes
                           3. Meses introducidos
                           4. Meses temperatura superior
                           5. Mostrar datos
                           6. Salir
                           """);

            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce un mes: ");
                    mes = sc.next();
                    System.out.print("Introduce su temperatura: ");
                    temperatura = sc.next();

                    t.introducirTemperatura(mes, opcion);
                }
                case 2 -> {
                    System.out.print("Introduce el mes a eliminar: ");
                    mes = sc.next();
                    t.eliminarMes(mes);
                }
                case 3 -> {
                    System.out.println("Meses introducidos: " + t.meses());
                }
                case 4 -> {

                }
                case 5 -> {
                    System.out.println("Datos: " + t.datosTemperaturas());
                }
                default -> {
                    System.out.println("La opción introducida no es válida");
                }
            }
        } while (opcion != 6);
        System.out.println("El programa ha finalizado.");
    }

}

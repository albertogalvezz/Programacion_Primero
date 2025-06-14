package temperaturas;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class Temperaturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperaturasMaximas t = new TemperaturasMaximas();
        int opcion;
        String mes;

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
                    opcion = sc.nextInt();

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
                    System.out.print("Introduce la temperatura a tener en cuenta: ");
                    opcion = sc.nextInt();
                  
                    System.out.println(t.mesesTemperaturaMayor(opcion));
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

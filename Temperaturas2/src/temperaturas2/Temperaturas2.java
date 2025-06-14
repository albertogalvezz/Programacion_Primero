package temperaturas2;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class Temperaturas2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Temperaturas t = new Temperaturas();
        int opcion;
        String mes;

        do {
            System.out.println("""
                               
                           MENÚ
                           1. Introducir temperatura
                           2. Eliminar mes
                           3. Eliminar temperaturas mes 
                           4. Meses introducidos
                           5. Meses temperatura superior    
                           6. Mostrar datos
                           7. Mostrar datos temperaturas ordenadas
                           8. Salir
                           """);

            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce un mes: ");
                    mes = sc.next();
                    System.out.print("Introduce su temperatura: ");
                    opcion = sc.nextInt();

                    if (t.introducirTemperatura(mes, opcion)) {
                        System.out.println("Se ha introducido la temperatura correctamente.");
                    } else {
                        System.err.println("No se ha podido eliminar la temperatura.");
                    }
                }
                case 2 -> {
                    System.out.print("Introduce el mes a eliminar: ");
                    mes = sc.next();

                    if (t.eliminarMes(mes)) {
                        System.out.println("Se ha eliminado el mes correctamente.");
                    } else {
                        System.err.println("No se ha podido eliminar el mes.");
                    }
                }
                case 3 -> {
                    System.out.print("Introduce el mes al que quieras eliminar temperatura: ");
                    mes = sc.next();

                    if (t.eliminarTemperaturasMes(mes)) {
                        System.out.println("La temperatura del mes " + mes + " se han eliminado correctamente.");
                    } else {
                        System.err.println("La temperatura del mes " + mes + " no se han podido eliminar.");
                    }
                }
                case 4 -> {
                    System.out.println("Meses introducidos: " + t.meses());
                }
                case 5 -> {
                    System.out.print("Introduce la temperatura límite: ");
                    opcion = sc.nextInt();

                    System.out.println(t.mesesTemperaturaMayor(opcion));
                }
                case 6 -> {
                    System.out.println("Datos: " + t.datosTemperaturas());
                }
                case 7 -> {
                    System.out.println("Datos temperaturas ordenadas: " + t.datosTemperaturasOrdenadas());
                }
                case 8 ->{
                    
                }
                default -> {
                    System.err.println("La opción introducida no es válida");
                }
            }

        } while (opcion != 8);
        System.out.println("El programa ha finalizado.");
    }
}

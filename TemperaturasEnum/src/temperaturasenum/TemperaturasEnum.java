package temperaturasenum;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class TemperaturasEnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperaturasMaximas t = new TemperaturasMaximas();
        int opcion;
        String mes;
        MesesEnum mesEnum;

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
                    mes = sc.next().toUpperCase();
                    System.out.print("Introduce su temperatura: ");
                    opcion = sc.nextInt();

                    try {
                        mesEnum = MesesEnum.valueOf(mes);
                        t.introducirTemperatura(mesEnum, opcion);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Mes inválido. Usa nombres como ENERO, FEBRERO, etc.");
                    }
                }
                case 2 -> {
                    System.out.print("Introduce el mes a eliminar: ");
                    mes = sc.next().toUpperCase();
                    
                    try {
                        mesEnum = MesesEnum.valueOf(mes);
                        t.eliminarMes(mesEnum);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Mes inválido. Usa nombres como ENERO, FEBRERO, etc.");
                    }
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
                case 6 -> {

                }
                default -> {
                    System.out.println("La opción introducida no es válida");
                }
            }
        } while (opcion != 6);
        System.out.println("El programa ha finalizado.");
    }

}

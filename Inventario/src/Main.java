import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int eleccion;
        String nombre;
        Integer cantidad;

        do {
            System.out.println("""
                    MENÚ PRINCIPAL
                    1. Agregar producto
                    2. Eliminar producto
                    3. Actualizar producto
                    4. Revisar inventario
                    0. Terminar proceso""");

            System.out.print("Introduce una opción: ");
            eleccion = sc.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.print("Introduce el nombre del producto: ");
                    nombre = sc.next();
                    System.out.print("Introduce la cantidad del producto: ");
                    cantidad = sc.nextInt();
                    inventario.agregarProducto(nombre, cantidad);
                    break;
                case 2:
                    System.out.print("Introduce el nombre del producto a eliminar: ");
                    nombre = sc.next();
                    inventario.eliminarProducto(nombre);
                    break;
                case 3:
                    System.out.print("Introduce el nombre del producto para actualizarlo: ");
                    nombre = sc.next();
                    System.out.print("Introduce la nueva cantidad del producto: ");
                    cantidad = sc.nextInt();
                    inventario.actualizarCantidad(nombre, cantidad);
                    break;
                case 4:
                    inventario.mostrarInventario();
                    break;
                case 0:
                    System.out.println("El programa ha terminado.");
                    break;
                default:
                    System.out.println("El número introducido no corresponde con ninguna opción.");
                    break;
            }
            System.out.println("");
        } while (eleccion != 0);
    }
}
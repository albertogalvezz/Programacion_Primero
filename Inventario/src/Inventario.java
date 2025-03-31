import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Inventario {
    Map<String, Integer> map = new HashMap<>();

    public void agregarProducto(String clave, Integer cantidad) {
        if (!map.containsKey(clave)) {
            map.put(clave, cantidad);
            System.out.println("Producto agregado");
        }else{
            System.out.println("Producto no agregado");
        }
    }

    public void eliminarProducto(String clave) {
        if (map.containsKey(clave)) {
            map.remove(clave);
            System.out.println("Producto eliminado");
        }else{
            System.out.println("Producto no encontrado");
        }
    }

    public void actualizarCantidad(String clave, Integer cantidad){
        if (map.containsKey(clave)) {
            map.put(clave, cantidad);
            System.out.println("Producto actualizado");
        }else{
            System.out.println("Producto no encontrado");
        }
    }

    public void mostrarInventario() {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

public class PizzaCalzone extends Pizza {

    double precioActualizado;

    public PizzaCalzone(int tiempoCoccion, double precio) {
        super(tiempoCoccion, precio);
        double incremento = (precio * 5) / 100;
        precioActualizado = incremento + precio;
    }
}

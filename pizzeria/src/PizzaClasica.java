public class PizzaClasica extends Pizza{

    boolean bordeConQueso;

    public PizzaClasica(int tiempoCoccion, double precio, boolean bordeConQueso) {
        super(tiempoCoccion, precio);
        this.bordeConQueso = bordeConQueso;
    }

    public boolean isBordeConQueso() {
        return bordeConQueso;
    }

    public void setBordeConQueso(boolean bordeConQueso) {
        this.bordeConQueso = bordeConQueso;
    }
}

public abstract class Pizza {
    private static int id;
    private int tiempoCoccion;
    private double precio;

    public Pizza(int tiempoCoccion, double precio) {
        id += 1;
        this.tiempoCoccion = tiempoCoccion;
        this.precio = precio;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Pizza.id = id;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

public class Mago extends Personaje{

    private String codigo;
    private int magia;

    public Mago() {
        super(10, 5, 3, 3);
        codigo = "M" + getCodigo();
        magia = 50;
    }

    @Override
    public String toString() {
        return "-Mago-\n" +
                "Código: " + codigo + "\n" +
                "Nivel de vida: " + getVida() + "\n" +
                "Posición: " + getPosicion() + "\n" +
                "Alcance de ataque: " + getAlcance() + "\n" +
                "Rango de movimiento: " + getMovimiento() + "\n" +
                "Fuerza: " + getFuerza() + "\n" +
                "Nivel de magia: " + magia + "\n";
    }
}

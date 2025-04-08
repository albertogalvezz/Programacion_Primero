public class Guerrero extends Personaje{

    private String codigo;
    private int alcance;
    private int movimiento;
    private int fuerza;

    public Guerrero() {
        super(20, 1, 5, 5);
        codigo = "G" + getCodigo();
    }

    @Override
    public String toString() {
        return "-Guerrero-\n" +
                "Código: " + codigo + "\n" +
                "Nivel de vida: " + getVida() + "\n" +
                "Posición: " + getPosicion() + "\n" +
                "Alcance de ataque: " + getAlcance() + "\n" +
                "Rango de movimiento: " + getMovimiento() + "\n" +
                "Fuerza: " + getFuerza() + "\n";
    }
}

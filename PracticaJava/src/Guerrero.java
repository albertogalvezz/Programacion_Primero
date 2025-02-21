public class Guerrero extends Personaje{

    String codigo;

    public Guerrero(int vida) {
        super(vida);
        codigo = "2" + Personaje.getCodigo();
    }

    @Override
    public String toString() {
        String cadena = "El " + getClass().getSimpleName() + " " + codigo + " tendrá " + getVida() + " puntos de vida";
        return cadena;
    }
}

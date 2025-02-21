public class Jefe extends Personaje{

    String codigo;
    int vidaExtra;

    public Jefe(int vida) {
        super(vida);
        codigo = "1" + Personaje.getCodigo();
        vidaExtra =  Integer.parseInt(codigo) / 2;
    }

    @Override
    public String toString() {
        String cadena = "El jefe " + codigo + " tendrá " + getVida() + " puntos de vida y " + vidaExtra + " puntos de vida extra";
        return cadena;
    }
}

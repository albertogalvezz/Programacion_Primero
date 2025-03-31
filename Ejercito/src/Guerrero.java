public class Guerrero extends Personaje{

    String codigo;

    public Guerrero(int vida) {
        super(vida);
        codigo = "2" + getCodigo();
    }
}

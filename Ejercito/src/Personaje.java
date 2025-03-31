public abstract class Personaje {

    private static int codigo;
    private int vida;

    public Personaje(int vida) {
        codigo++;
        this.vida = vida;
    }

    public static int getCodigo() {
        return codigo;
    }

    public static void setCodigo(int codigo) {
        Personaje.codigo = codigo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}

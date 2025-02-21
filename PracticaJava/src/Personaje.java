public abstract class Personaje {
    private static int codigo = 0;
    private int vida;

    public Personaje(int vida) {
        this.vida = vida;
        codigo++;
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

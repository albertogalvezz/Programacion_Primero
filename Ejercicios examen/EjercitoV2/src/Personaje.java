import java.util.Random;

public abstract class Personaje {
    private static int codigo;
    private int vida;
    private int posicion;
    private int alcance;
    private int movimiento;
    private int fuerza;

    public Personaje(int vida, int alcance, int movimiento, int fuerza) {
        Random num = new Random();
        this.codigo++;
        this.vida = vida;
        this.alcance = alcance;
        this.movimiento = movimiento;
        this.fuerza = fuerza;
        this.posicion = num.nextInt(20) + 1;
    }

    public int simularAtaque() {
        return getFuerza();
    }

    public void recibirAtaque(int puntos) {
        this.vida = this.vida - puntos;

        if (this.vida < 0) {
            this.vida = 0;
            System.out.println("El personaje con código: " + codigo + " ha muerto...");
        }

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

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}

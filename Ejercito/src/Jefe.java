import javax.swing.*;

public class Jefe extends Personaje {

    private String codigo;
    private int vidaExtra;

    public Jefe(int vida) {
        super(vida);
        codigo = "1" + getCodigo();
        vidaExtra = Integer.parseInt(codigo) / 2;
    }


}

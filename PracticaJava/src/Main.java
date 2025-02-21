import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int aleatorio = (int) (Math.random() * 4 + 3);
        ArrayList<Personaje> lista = new ArrayList<Personaje>();

        for (int i = 0; i < aleatorio - 1; i++) {
            lista.add(new Guerrero(15));
        }
        lista.add(new Jefe(20));

        System.out.println(lista);
    }

    public static void rellenarEjercito(){

    }
}
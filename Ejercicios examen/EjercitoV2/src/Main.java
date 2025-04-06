import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ejercito ejercito = new Ejercito();
        Ejercito ejercito2 = new Ejercito();

        System.out.println(ejercito);
        System.out.println(ejercito2);

        ejercito.realizarAtaque(ejercito2);

        System.out.println(ejercito);
        System.out.println(ejercito2);

        ejercito.realizarAtaque(ejercito2);

        System.out.println(ejercito);
        System.out.println(ejercito2);
    }
}
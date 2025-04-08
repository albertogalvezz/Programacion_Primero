import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Palindromo pal = new Palindromo();
        Pila pila = new Pila();
        Cola cola = new Cola();
        String cadena;

        do{
            System.out.print("Introduce tu palabra: ");
            cadena = sc.nextLine();
            cadena = formatoCadena(cadena);

            System.out.println(cadena);

        }while (!cadena.equals("salir"));
    }

    public static String formatoCadena(String cadena){
        cadena = cadena.trim();
        cadena = cadena.toLowerCase();
        return cadena;
    }
}
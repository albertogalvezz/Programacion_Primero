import java.util.Arrays;

public class Ejercito {

    private static int codigo;
    private Personaje[] ejercito;

    public Ejercito() {
        codigo++;
        int cantidadPersonajes = (int) (Math.random()*4+3);
        ejercito = new Personaje[cantidadPersonajes];
        int cont = 0;

        // Rellenar ejército
        for (int i = 0; i < cantidadPersonajes; i++) {
            int asignarPersonaje = (int) (Math.random()*2);

            if (asignarPersonaje == 0) {
                ejercito[cont++] = new Guerrero();
            }else{
                ejercito[cont++] = new Mago();
            }
        }
    }

    public int tamanyoEjercito() {
        return ejercito.length;
    }

    public void realizarAtaque(Ejercito enemigo){
        for (int i = 0; i < ejercito.length; i++) {
            int enemigoAleatorio = (int) (Math.random()*enemigo.tamanyoEjercito());
            enemigo.obtenerPersonaje(enemigoAleatorio).recibirAtaque(ejercito[i].getFuerza());
            System.out.println("El enemigo " + enemigoAleatorio + " ha recibido un ataque de " + ejercito[i].getFuerza()+ " de fuerza");
        }
    }

    public void eliminarPersonaje(int pos){
        ejercito[pos] = null;
    }

    public boolean ejercitoDerrotado(){
        return ejercito[0] == null;
    }

    public Personaje obtenerPersonaje(int pos){
        return ejercito[pos];
    }

    public void moverPersonaje(Personaje personaje){

    }

    @Override
    public String toString() {
        return "EJERCITO: " + codigo + " componentes\n" +
                Arrays.toString(ejercito);
    }
}

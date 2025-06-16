
package embarcaciones;

/**
 *
 * @author Alberto
 */
public class Acorazado extends Barco{
    
    private static int numAcorazado = 1;
    private int numCanyones;
    
    public Acorazado(double longitud, int numCanyones) {
        super(longitud);
        this.codigo = "Ac-" + numAcorazado++;
        this.numCanyones = numCanyones;
        
    }

    public int getNumCanyones() {
        return numCanyones;
    }

    public void setNumCanyones(int numCanyones) {
        this.numCanyones = numCanyones;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero cañones: " + numCanyones + "\n";
    }
    
    
}

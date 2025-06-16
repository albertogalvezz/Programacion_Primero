
package embarcaciones;

/**
 *
 * @author Alberto
 */
public class Submarino extends Barco {
    
    private static int numSubmarino = 1;
    private double periscopio;
    
    public Submarino(double longitud) {
        super(longitud);
        
        this.codigo = "Sub-" + numSubmarino; 
        this.periscopio = longitud / 10;
    }
    
    public double longitudPeriscopio(){
        return periscopio;
    }

    public double getPeriscopio() {
        return periscopio;
    }

    public void setPeriscopio(double periscopio) {
        this.periscopio = periscopio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPeriscopio: " + this.periscopio + "\n";
    }
    
    
    
}

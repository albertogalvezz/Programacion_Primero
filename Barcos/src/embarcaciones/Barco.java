
package embarcaciones;

/**
 *
 * @author Alberto
 */
public abstract class Barco {
    protected String codigo;
    protected double longitud;

    public Barco(double longitud) {
        this.codigo = codigo;
        this.longitud = longitud;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.longitud) ^ (Double.doubleToLongBits(this.longitud) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Barco other = (Barco) obj;
        return Double.doubleToLongBits(this.longitud) == Double.doubleToLongBits(other.longitud);
    }
    
    

    @Override
    public String toString() {
        return getClass().getSimpleName() + "\nCódigo: " + this.codigo + "\nLongitud: "+  this.longitud;
    }
    
    
}
